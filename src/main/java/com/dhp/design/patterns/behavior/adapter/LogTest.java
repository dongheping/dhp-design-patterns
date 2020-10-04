package com.dhp.design.patterns.behavior.adapter;

import com.dhp.design.patterns.behavior.adapter.commons.CommonsLog;
import com.dhp.design.patterns.behavior.adapter.commons.CommonsLogAdapter;
import com.dhp.design.patterns.behavior.adapter.log4j.Log4j;
import com.dhp.design.patterns.behavior.adapter.log4j.Log4jAdapter;

public class LogTest {

    public static void main(String[] args) {
        Log log4j = new Log4jAdapter(new Log4j());
        Log commonsLog = new CommonsLogAdapter(new CommonsLog());
        log4j.trace();
        commonsLog.trace();
    }
}
