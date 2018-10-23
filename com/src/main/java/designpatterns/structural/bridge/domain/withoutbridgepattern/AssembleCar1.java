package main.java.designpatterns.structural.bridge.domain.withoutbridgepattern;

/**
 * Created by Kannan on 10/23/2018.
 */
public class AssembleCar1 extends Car1{

    @Override
    public void doWork() {
        manufacture();
        System.out.println("assembled");
    }
}
