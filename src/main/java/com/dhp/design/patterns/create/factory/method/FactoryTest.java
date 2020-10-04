package com.dhp.design.patterns.create.factory.method;

import com.dhp.design.patterns.create.factory.bean.Animal;

/**
 * 测试主类
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.create();
        Factory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.create();
    }
}
