package main.java.designpatterns.structural.bridge.withoutbridgepattern;

/**
 * Created by Kannan on 10/23/2018.
 */
public abstract class Car1 implements Vehicle1{

    @Override
    public void manufacture() {
        System.out.println("manufacture car");
    }

    public abstract void doWork();
}
