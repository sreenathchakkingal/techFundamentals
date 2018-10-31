package main.java.designpatterns.structural.flyweight;

/**
 * Created by Kannan on 10/27/2018.
 */
public class FlyWeightDemoMain {

    public static void main(String[] args) {
        final Vehicle swift = VehicleFactory.getVehicle("SWIFT");
        final Vehicle ritz = VehicleFactory.getVehicle("RITZ");
        swift.assignColor("Red");
        ritz.assignColor("Grey");

    }
}
