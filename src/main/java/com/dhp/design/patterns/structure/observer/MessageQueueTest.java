package com.dhp.design.patterns.structure.observer;

/**
 * 观察者（Observer）模式的定义：指多个对象间存在一对多的依赖关系，
 * 当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式。
 */
public class MessageQueueTest {

    public static void main(String[] args) {
        MessageQueue mq = new MessageQueue();
        Consumer consumer = new Consumer(mq,"topicA");
        Consumer consumer1 = new Consumer(mq,"topicB");
        Consumer consumer2 = new Consumer(mq,"topicC");
        mq.subscribe(consumer);
        mq.subscribe(consumer1);
        mq.subscribe(consumer2);
        mq.send("topicA","messageA111");
        mq.send("topicA","messageA222");
        mq.unSubscribe(consumer);
        mq.send("topicA","messageA222");
        mq.send("topicB","messageB111");
    }
}
