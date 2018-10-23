package main.java.designpatterns.structural.bridge.domain.workshop;

/**
 * Created by Kannan on 10/23/2018.
 */
public class AssembleWorkshop implements Workshop {

    @Override
    public void doWork() {
        System.out.println("assembled");
    }
}
