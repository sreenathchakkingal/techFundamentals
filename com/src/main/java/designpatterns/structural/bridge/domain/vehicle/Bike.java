package main.java.designpatterns.structural.bridge.domain.vehicle;

import main.java.designpatterns.structural.bridge.domain.workshop.Workshop;

/**
 * Created by Kannan on 10/23/2018.
 */
public class Bike extends Vehicle {


    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture bike");
        workshop1.doWork();
        workshop2.doWork();
    }
}
