package com.dhp.design.patterns.behavior.proxy;

public class GoogleSearchProxy implements Search{

    private GoogleSearch googleSearch;

    public GoogleSearchProxy(GoogleSearch googleSearch){
        this.googleSearch = googleSearch;
    }

    private void preSearch(){
        System.out.println("国内无法使用google搜索,开启代理");
    }

    private void afterSearch(){
        System.out.println("开启代理后使用google搜索成功!");
    }

    @Override
    public void search() {
        preSearch();
        googleSearch.search();
        afterSearch();
    }
}
