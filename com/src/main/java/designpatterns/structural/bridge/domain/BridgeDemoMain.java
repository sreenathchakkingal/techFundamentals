package main.java.designpatterns.structural.bridge.domain;

import main.java.designpatterns.structural.bridge.domain.vehicle.Bike;
import main.java.designpatterns.structural.bridge.domain.vehicle.Car;
import main.java.designpatterns.structural.bridge.domain.vehicle.Vehicle;
import main.java.designpatterns.structural.bridge.domain.workshop.AssembleWorkshop;
import main.java.designpatterns.structural.bridge.domain.workshop.ProduceWorkshop;
import main.java.designpatterns.structural.bridge.domain.workshop.Workshop;

/**
 * Created by Kannan on 10/23/2018.
 */
public class BridgeDemoMain {

    public static void main(String[] args) {
        Workshop produce = new ProduceWorkshop();
        Workshop assemble = new AssembleWorkshop();
        Vehicle car = new Car(produce, assemble);
        Vehicle bike = new Bike(produce, assemble);
        car.manufacture();
        bike.manufacture();
    }
}
