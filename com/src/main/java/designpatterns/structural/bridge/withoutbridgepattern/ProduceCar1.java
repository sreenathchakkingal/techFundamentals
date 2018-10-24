package main.java.designpatterns.structural.bridge.withoutbridgepattern;

/**
 * Created by Kannan on 10/23/2018.
 */
public class ProduceCar1 extends Car1{

    @Override
    public void doWork() {
        manufacture();
        System.out.println("produced");
    }
}
