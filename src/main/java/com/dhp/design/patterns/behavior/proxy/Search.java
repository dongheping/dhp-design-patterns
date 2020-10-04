package com.dhp.design.patterns.behavior.proxy;

/**
 * 代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。
 * 这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
 * 搜索引擎进行搜索
 */
public interface Search {
    void search();
}
