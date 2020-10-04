package com.dhp.design.patterns.structure.chain;

import java.util.Objects;

public class MerchantInterceptor extends Interceptor{

    public MerchantInterceptor(Interceptor next) {
        super(next);
    }

    @Override
    void intercept() {
        if(Objects.nonNull(getNext())){
            getNext().intercept();
        }
        System.out.println("我是商家拦截器,判断是否是商家");
    }
}
