package main.java.designpatterns.creational.factory.abstractfactorypattern;

import main.java.designpatterns.creational.factory.domain.Animal;
import main.java.designpatterns.creational.factory.domain.Horse;

/**
 * Created by Kannan on 10/12/2018.
 */
public class HorseFactory implements AbstractAnimalFactory{

    public Animal getAnimalInstance() {
        return new Horse();
    }

}
