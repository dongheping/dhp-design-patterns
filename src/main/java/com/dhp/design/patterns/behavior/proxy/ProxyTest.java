package com.dhp.design.patterns.behavior.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        GoogleSearchProxy proxy = new GoogleSearchProxy(new GoogleSearch());
        proxy.search();
    }
}
