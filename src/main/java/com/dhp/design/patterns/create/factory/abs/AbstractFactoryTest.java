package com.dhp.design.patterns.create.factory.abs;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Fruit;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory beijingFactory = new BeijingFactory();
        Animal cat = beijingFactory.createAnimal();
        Fruit apple = beijingFactory.getFruit();
        cat.create();
        apple.eat();

        AbstractFactory hongkongFactory = new HongkongFactory();
        Animal dog = hongkongFactory.createAnimal();
        Fruit banana = hongkongFactory.getFruit();
        dog.create();
        banana.eat();
    }
}
