package main.java.designpatterns.structural.facade;

/**
 * Created by Kannan on 10/25/2018.
 */

//expose the key functionality via the facade class.
public class GarageFacade {


    private VehicleMaintenance bikeMaintenance;
    private VehicleMaintenance carMaintenance;

    public GarageFacade()
    {
        this.bikeMaintenance = new BikeMaintenance();
        this.carMaintenance = new CarMaintenance();
    }

    public void repairCar()
    {
        this.carMaintenance.doRepair();
    }

    public void repairBike()
    {
        this.bikeMaintenance.doRepair();
    }
}
