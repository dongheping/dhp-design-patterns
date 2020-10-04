package com.dhp.design.patterns.create.factory.abs;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Banana;
import com.dhp.design.patterns.create.factory.bean.Dog;
import com.dhp.design.patterns.create.factory.bean.Fruit;

public class HongkongFactory implements AbstractFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
