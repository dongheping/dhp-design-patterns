package com.dhp.design.patterns.behavior.adapter;

/**
 * Mybatis源码中定义的日志级别只有warn/error/debug/trace 四个级别,并且
 * Mybatis没有自己的日志组件,因此使用适配器模式,将现有的log组件适配进来
 */
public interface Log {
    void warn();

    void error();

    void debug();

    void trace();
}
