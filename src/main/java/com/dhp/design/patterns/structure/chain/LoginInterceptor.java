package com.dhp.design.patterns.structure.chain;

import java.util.Objects;

import com.sun.java.swing.action.NextAction;

public class LoginInterceptor extends Interceptor {

    public LoginInterceptor(Interceptor next) {
        super(next);
    }

    @Override
    public void intercept() {
        if(Objects.nonNull(getNext())){
            getNext().intercept();
        }
        System.out.println("我是登陆拦截器,先验证是否登陆");
    }
}
