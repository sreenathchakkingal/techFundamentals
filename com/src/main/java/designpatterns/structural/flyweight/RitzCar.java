package main.java.designpatterns.structural.flyweight;

/**
 * Created by Kannan on 10/25/2018.
 */
public class RitzCar implements Vehicle {

    private String type;
    private String color;

    @Override
    public void assignType() {
        this.type="RITZ";
    }

    @Override
    public void assignColor(String color) {
        this.color=color;
    }
}
