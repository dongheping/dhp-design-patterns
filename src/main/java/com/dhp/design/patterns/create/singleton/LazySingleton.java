package com.dhp.design.patterns.create.singleton;

/**
 * 懒汉式单例模式,存在线程安全问题
 */
public class LazySingleton {
    private LazySingleton(){}
    private static LazySingleton singleton;
    public static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton==singleton1);
    }
}
