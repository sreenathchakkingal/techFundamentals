package main.java.designpatterns.structural.decorator;

/**
 * Created by Kannan on 10/24/2018.
 */
public class Car implements Vehicle {

    @Override
    public void description() {
        System.out.println("this is a car");
    }
}
