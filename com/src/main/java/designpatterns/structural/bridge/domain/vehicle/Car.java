package main.java.designpatterns.structural.bridge.domain.vehicle;

import main.java.designpatterns.structural.bridge.domain.workshop.Workshop;

/**
 * Created by Kannan on 10/23/2018.
 */
public class Car extends Vehicle {

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("manufacture car");
        workshop1.doWork();
        workshop2.doWork();
    }
}
