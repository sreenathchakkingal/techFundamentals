package main.java.designpatterns.structural.flyweight;

/**
 * Created by Kannan on 10/25/2018.
 */
public class SwiftCar implements Vehicle {

    @Override
    public void assignType(String type) {
        System.out.println("Swift");
    }

    @Override
    public void assignColor(String color) {
        System.out.println("Red");
    }
}
