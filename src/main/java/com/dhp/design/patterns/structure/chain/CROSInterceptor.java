package com.dhp.design.patterns.structure.chain;

import java.util.Objects;

public class CROSInterceptor extends Interceptor{

    public CROSInterceptor(Interceptor next) {
        super(next);
    }

    @Override
    void intercept() {
        if(Objects.nonNull(getNext())){
            getNext().intercept();
        }
        System.out.println("我是跨域拦截器,先验证是否跨域");
    }
}
