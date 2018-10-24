package main.java.designpatterns.structural.decorator;

/**
 * Created by Kannan on 10/24/2018.
 */
public class SwiftCar extends CarDecorator {

    public SwiftCar(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Swift type");
        System.out.println("Red Color");
    }
}
