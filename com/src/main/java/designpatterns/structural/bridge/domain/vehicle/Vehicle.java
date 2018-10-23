package main.java.designpatterns.structural.bridge.domain.vehicle;

import main.java.designpatterns.structural.bridge.domain.workshop.Workshop;

/**
 * Created by Kannan on 10/23/2018.
 */
public abstract class Vehicle {

    protected Workshop workshop1;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2)
    {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    public abstract void manufacture();

}
