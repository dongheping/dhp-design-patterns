package com.dhp.design.patterns.structure.strategy;

public class HalfDiscount implements DiscountStrategy {

    @Override
    public void discount() {
        System.out.println("五折优惠");
    }
}
