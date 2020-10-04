package com.dhp.design.patterns.behavior.adapter.log4j;

import com.dhp.design.patterns.behavior.adapter.Log;

public class Log4jAdapter implements Log {
    private Log4j log4j;

    public Log4jAdapter(Log4j log4j){
        this.log4j = log4j;
    }

    @Override
    public void warn() {
        log4j.warn();
    }

    @Override
    public void error() {
        log4j.error();
    }

    @Override
    public void debug() {
        log4j.debug();
    }

    @Override
    public void trace() {
        System.out.println("调用log4j的info方法适配Mybatis.trace方法");
        log4j.info();
    }
}
