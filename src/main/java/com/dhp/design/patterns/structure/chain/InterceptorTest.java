package com.dhp.design.patterns.structure.chain;

public class InterceptorTest {

    public static void main(String[] args) {
        Interceptor crosInterceptor = new CROSInterceptor(null);
        Interceptor loginInterceptor = new LoginInterceptor(crosInterceptor);
        Interceptor merchantInterceptor = new MerchantInterceptor(loginInterceptor);
        merchantInterceptor.intercept();
    }
}
