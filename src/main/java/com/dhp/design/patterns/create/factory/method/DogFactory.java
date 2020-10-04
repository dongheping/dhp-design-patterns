package com.dhp.design.patterns.create.factory.method;

import com.dhp.design.patterns.create.factory.bean.Animal;
import com.dhp.design.patterns.create.factory.bean.Dog;

public class DogFactory implements Factory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
