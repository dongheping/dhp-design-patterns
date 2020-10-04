package com.dhp.design.patterns.create.factory.method;

import com.dhp.design.patterns.create.factory.bean.Animal;

/**
 * 工厂方法模式:工厂接口
 */
public interface Factory {
    Animal createAnimal();
}
