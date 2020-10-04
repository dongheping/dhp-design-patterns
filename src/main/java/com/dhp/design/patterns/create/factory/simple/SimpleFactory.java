package com.dhp.design.patterns.create.factory.simple;

import java.util.Objects;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Cat;
import com.dhp.design.patterns.create.factory.bean.Dog;

/**
 * 在简单工厂模式中创建实例的方法通常为静态（static）方法，
 * 因此简单工厂模式（Simple Factory Pattern）又叫作静态工厂方法模式（Static Factory Method Pattern）。
 * 简单来说，简单工厂模式有一个具体的工厂类，可以生成多个不同的产品，属于创建型设计模式。
 * 简单工厂模式不在 GoF 23 种设计模式之列。
 * 简单工厂模式每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，
 * 这增加了系统的复杂度，违背了“开闭原则”。
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
