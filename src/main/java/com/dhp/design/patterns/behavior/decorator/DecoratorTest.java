package com.dhp.design.patterns.behavior.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        RedColorDecorator redColorBedroomDecorator = new RedColorDecorator(new Bedroom());
        redColorBedroomDecorator.decorator();
        RedColorDecorator redColorDecorator = new RedColorDecorator(new LivingRoom());
        redColorDecorator.decorator();
    }
}
