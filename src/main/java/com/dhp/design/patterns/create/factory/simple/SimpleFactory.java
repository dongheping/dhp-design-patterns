package com.dhp.design.patterns.create.factory.simple;

import java.util.Objects;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Cat;
import com.dhp.design.patterns.create.factory.bean.Dog;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    private static final String Dog = "dog";
    private static final String Cat = "cat";

    public static Animal createAnimal(String animal){
        switch(animal){
            case Dog:return new Dog();
            case Cat:return new Cat();
            default:
        }
       return null;
    }

    public static void main(String[] args) {
        Animal dog = SimpleFactory.createAnimal(Dog);
        Objects.requireNonNull(dog).create();
        Animal cat = SimpleFactory.createAnimal(Cat);
        Objects.requireNonNull(cat).create();
    }
}
