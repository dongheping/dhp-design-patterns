package com.dhp.design.patterns.create.singleton;

/**
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
