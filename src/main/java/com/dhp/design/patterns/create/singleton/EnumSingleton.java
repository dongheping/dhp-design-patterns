package com.dhp.design.patterns.create.singleton;

import sun.security.util.Cache;

/**
 * 单例模式的缓存实现
 */
public enum EnumSingleton {
    /**
     * 枚举类单例模式
     */
    INSTANCE;

    private static final Cache<String,Object> cache = Cache.newHardMemoryCache(16);

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object get(String key){
        return cache.get(key);
    }

    public void put(String key,Object value){
        cache.put(key,value);
    }

    public void delete(String key){
        cache.remove(key);
    }

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.getInstance();
        singleton.put("key","value");
        System.out.println(singleton.get("key"));
    }
}
