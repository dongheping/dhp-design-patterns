package com.dhp.design.patterns.create.factory.method;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Cat;

public class CatFactory implements Factory{

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
