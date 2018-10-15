package main.java.designpatterns.creational.factory.abstractfactorypattern;

import main.java.designpatterns.creational.factory.domain.Animal;

/**
 * Created by Kannan on 10/12/2018.
 */
public interface AbstractAnimalFactory {
    public Animal getAnimalInstance();

}
