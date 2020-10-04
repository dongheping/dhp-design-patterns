package com.dhp.design.patterns.create.factory.abs;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Fruit;

/**
 * 抽象工厂模式：工厂接口
 */
public interface AbstractFactory {
    Animal createAnimal();

    Fruit getFruit();
}
