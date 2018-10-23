package main.java.designpatterns.structural.bridge.domain.workshop;

/**
 * Created by Kannan on 10/23/2018.
 */
public class ProduceWorkshop implements Workshop {

    @Override
    public void doWork() {
        System.out.println("produced");
    }
}
