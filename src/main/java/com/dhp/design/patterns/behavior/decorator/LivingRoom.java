package com.dhp.design.patterns.behavior.decorator;

public class LivingRoom implements Decorator{

    @Override
    public void decorator() {
        System.out.println("我是客厅");
    }
}
