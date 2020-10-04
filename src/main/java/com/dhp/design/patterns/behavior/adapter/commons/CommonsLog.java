package com.dhp.design.patterns.behavior.adapter.commons;

/**
 * 模拟org.apache.commons.logging.Log
 */
public class CommonsLog {
    public void info(){
        System.out.println("CommonsLog打印info日志");
    }

    public void error(){
        System.out.println("CommonsLog打印error日志");
    }

    public void debug(){
        System.out.println("CommonsLog打印debug日志");
    }

    public void warn(){
        System.out.println("CommonsLog打印warn日志");
    }
}
