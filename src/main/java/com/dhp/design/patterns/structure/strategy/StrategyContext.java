package com.dhp.design.patterns.structure.strategy;

public class StrategyContext {
    private DiscountStrategy discountStrategy;

    public StrategyContext(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public StrategyContext(){

    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void executeStrategy(){
        discountStrategy.discount();
    }
}
