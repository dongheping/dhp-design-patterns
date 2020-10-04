package com.dhp.design.patterns.create.factory.abs;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Apple;
import com.dhp.design.patterns.create.factory.bean.Cat;
import com.dhp.design.patterns.create.factory.bean.Fruit;

public class BeijingFactory implements AbstractFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
