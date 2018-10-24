package main.java.designpatterns.structural.decorator;

/**
 * Created by Kannan on 10/24/2018.
 */
//https://www.javatpoint.com/decorator-pattern
public class DecoratorDemoMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.description();

        Vehicle ritzCar = new RitzCar(car);
        Vehicle swiftCar = new SwiftCar(car);

        ritzCar.description();
        swiftCar.description();
    }
}
