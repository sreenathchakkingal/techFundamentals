package main.java.designpatterns.creational.factory.factorypattern;

import main.java.designpatterns.creational.factory.domain.Animal;
import main.java.designpatterns.creational.factory.domain.Dog;
import main.java.designpatterns.creational.factory.domain.Horse;

/**
 * Created by Kannan on 10/12/2018.
 */

//https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
public class AnimalFactory {

    public static Animal getAnimalInstance(String type)
    {
        if("dog".equalsIgnoreCase(type))
        {
            return new Dog();
        }
        if("horse".equalsIgnoreCase(type))
        {
            return new Horse();
        }
        return null;
    }
}
