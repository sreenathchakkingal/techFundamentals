package main.java.designpatterns.structural.facade;

/**
 * Created by Kannan on 10/25/2018.
 */
public class FacadeDemoMain {

    public static void main(String[] args) {
        GarageFacade garage = new GarageFacade();
        garage.repairBike();
        garage.repairCar();
    }
}
