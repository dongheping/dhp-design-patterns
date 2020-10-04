package com.dhp.design.patterns.structure.observer;

import javax.annotation.PreDestroy;

import lombok.Data;

@Data
public class Consumer {

    private String topic;
    private MessageQueue mq;

    public Consumer(MessageQueue mq, String topic){
        this.mq = mq;
        this.topic = topic;
        mq.subscribe(this);
    }

    @PreDestroy
    public void unSubscribe(){
        mq.unSubscribe(this);
    }

    public void onMessage(String message) {
        System.out.println("-----------");
        System.out.println("I subscribe topic is:" +  topic);
        System.out.println("收到并消费消息队列的新消息：" + message);
    }

}
