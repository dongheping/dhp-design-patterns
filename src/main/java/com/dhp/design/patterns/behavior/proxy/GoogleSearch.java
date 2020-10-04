package com.dhp.design.patterns.behavior.proxy;

public class GoogleSearch implements Search{

    @Override
    public void search() {
        System.out.println("使用谷歌网站进行搜索");
    }
}
