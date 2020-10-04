package com.dhp.design.patterns.create.singleton;

/**
 * 线程安全的单例模式
 */
public class LazySafeSingleton {
    private LazySafeSingleton(){}
    private static volatile LazySafeSingleton singleton;
    public static LazySafeSingleton getInstance(){
        if(singleton == null){
            synchronized (LazySafeSingleton.class){
                if(singleton == null){
                    singleton = new LazySafeSingleton();
                }
            }
        }
        return singleton;
    }
}
