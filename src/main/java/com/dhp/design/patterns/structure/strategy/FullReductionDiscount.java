package com.dhp.design.patterns.structure.strategy;

public class FullReductionDiscount implements DiscountStrategy {

    @Override
    public void discount() {
        System.out.println("满100省70");
    }
}
