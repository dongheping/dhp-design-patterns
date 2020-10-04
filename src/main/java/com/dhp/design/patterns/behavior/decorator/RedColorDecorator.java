package com.dhp.design.patterns.behavior.decorator;

public class RedColorDecorator extends ColorDecorator{

    public RedColorDecorator(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void decorator() {
        super.decorator();
        setColor();
    }

    private void setColor() {
        System.out.println("我把墙刷成粉色了");
    }
}
