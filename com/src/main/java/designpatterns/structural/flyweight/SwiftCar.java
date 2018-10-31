package main.java.designpatterns.structural.flyweight;

/**
 * Created by Kannan on 10/25/2018.
 */
public class SwiftCar implements Vehicle {

    private String type;
    private String color;

    @Override
    public void assignType() {
        this.type="SWIFT";
    }

    @Override
    public void assignColor(String color) {
        this.color=color;
    }
}
