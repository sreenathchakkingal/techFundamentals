package main.java.designpatterns.structural.flyweight;

/**
 * Created by Kannan on 10/25/2018.
 */
public class RitzCar implements Vehicle {

    @Override
    public void assignType(String type) {
        System.out.println("Ritz");
    }

    @Override
    public void assignColor(String color) {
        System.out.println("Grey");
    }
}
