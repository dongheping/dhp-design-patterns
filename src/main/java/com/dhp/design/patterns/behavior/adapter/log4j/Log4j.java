package com.dhp.design.patterns.behavior.adapter.log4j;

/**
 * 模拟log4j
 */
public class Log4j {
    public void info(){
        System.out.println("Log4j打印info日志");
    }

    public void error(){
        System.out.println("Log4j打印error日志");
    }

    public void debug(){
        System.out.println("Log4j打印debug日志");
    }

    public void warn(){
        System.out.println("Log4j打印warn日志");
    }
}
