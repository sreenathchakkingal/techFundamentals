package main.java.designpatterns.structural.decorator;

/**
 * Created by Kannan on 10/24/2018.
 */
public class RitzCar extends CarDecorator {

    public RitzCar(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void type() {
        super.type();
        System.out.println("Ritz type");
        System.out.println("Grey color");
    }
}
