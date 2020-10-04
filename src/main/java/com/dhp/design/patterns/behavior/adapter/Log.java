package com.dhp.design.patterns.behavior.adapter;

/**
 * 适配器模式的定义:
 * 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 * 适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，
 * 且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 * Mybatis源码中定义的日志级别只有warn/error/debug/trace 四个级别,并且
 * Mybatis没有自己的日志组件,因此使用适配器模式,将现有的log组件适配进来
 */
public interface Log {
    void warn();

    void error();

    void debug();

    void trace();
}
