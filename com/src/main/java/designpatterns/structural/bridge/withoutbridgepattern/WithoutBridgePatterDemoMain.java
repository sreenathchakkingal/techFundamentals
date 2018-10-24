package main.java.designpatterns.structural.bridge.withoutbridgepattern;

/**
 * Created by Kannan on 10/23/2018.
 */
public class WithoutBridgePatterDemoMain {

    public static void main(String[] args) {
        Car1 produceCar1 = new ProduceCar1();
        produceCar1.doWork();
    }

}
