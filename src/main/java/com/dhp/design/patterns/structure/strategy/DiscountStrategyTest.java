package com.dhp.design.patterns.structure.strategy;

import java.util.Random;

public class DiscountStrategyTest {

    public static void main(String[] args) {
        Random random = new Random();
        StrategyContext strategyContext = random.nextInt(7) % 2 == 0 ?
            new StrategyContext(new FullReductionDiscount()) :
            new StrategyContext(new HalfDiscount());
        strategyContext.executeStrategy();
    }
}
