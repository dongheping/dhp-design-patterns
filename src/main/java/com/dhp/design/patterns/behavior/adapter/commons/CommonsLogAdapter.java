package com.dhp.design.patterns.behavior.adapter.commons;

import com.dhp.design.patterns.behavior.adapter.Log;

/**
 * 模拟org.apache.commons.logging.Log
 */
public class CommonsLogAdapter implements Log {
    private CommonsLog commonsLog;
    public CommonsLogAdapter(CommonsLog commonsLog){
        this.commonsLog = commonsLog;
    }

    @Override
    public void warn() {
        commonsLog.warn();
    }

    @Override
    public void error() {
        commonsLog.error();
    }

    @Override
    public void debug() {
        commonsLog.debug();
    }

    @Override
    public void trace() {
        System.out.println("调用commonsLog的info方法适配Mybatis.trace方法");
        commonsLog.info();
    }
}
