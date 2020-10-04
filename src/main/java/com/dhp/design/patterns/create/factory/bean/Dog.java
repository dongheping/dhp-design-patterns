package com.dhp.design.patterns.create.factory.bean;

public class Dog implements  Animal{

    @Override
    public void create() {
        System.out.println("创建了一只狗狗");
    }
}
