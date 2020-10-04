package com.dhp.design.patterns.behavior.decorator;

public abstract class ColorDecorator implements Decorator{

    private Decorator decorator;

    public ColorDecorator(Decorator decorator){
        this.decorator = decorator;
    }


    @Override
    public void decorator() {
        decorator.decorator();
    }
}
