package main.java.designpatterns.creational.factory.abstractfactorypattern;

import main.java.designpatterns.creational.factory.domain.Animal;

/**
 * Created by Kannan on 10/15/2018.
 */
public class AbstractFactoryDemoMain {

    public static void main(String[] args) {

        final Animal dogInstance = AnimalFactory.getAnimalInstance(new DogFactory());
        final Animal horseInstance = AnimalFactory.getAnimalInstance(new HorseFactory());
        System.out.println(dogInstance.getSound());
        System.out.println(horseInstance.getSound());
    }
}
