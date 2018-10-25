package main.java.designpatterns.structural.facade;

/**
 * Created by Kannan on 10/25/2018.
 */
public class BikeMaintenance implements VehicleMaintenance {

    @Override
    public void doRepair() {
        System.out.println("process bike repair");
    }
}
