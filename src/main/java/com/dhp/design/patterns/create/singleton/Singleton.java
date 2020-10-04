package com.dhp.design.patterns.create.singleton;

/**
 * 单例（Singleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 * 饿汉式单例模式
 */
public class Singleton {
    private Singleton(){}
    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton==singleton1);
    }
}
