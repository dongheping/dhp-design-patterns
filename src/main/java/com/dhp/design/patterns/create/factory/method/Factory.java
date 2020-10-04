package com.dhp.design.patterns.create.factory.method;

import com.dhp.design.patterns.create.factory.bean.Animal;

/**
 * 工厂方法模式:工厂接口
 * “工厂方法模式”是对简单工厂模式的进一步抽象化，
 * 其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。
 */
public interface Factory {
    Animal createAnimal();
}
