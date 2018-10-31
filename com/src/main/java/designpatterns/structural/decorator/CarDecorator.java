package main.java.designpatterns.structural.decorator;

/**
 * Created by Kannan on 10/24/2018.
 */
public abstract class CarDecorator implements Vehicle {

    private Vehicle vehicle;

    public CarDecorator(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    @Override
    public void type() {
        System.out.println("this is a car decorator");
    }
}
