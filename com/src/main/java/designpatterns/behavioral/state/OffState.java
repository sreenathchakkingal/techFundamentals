package main.java.designpatterns.behavioral.state;

/**
 * Created by Kannan on 11/16/2018.
 */
public class OffState implements State {

    @Override
    public void doAction() {
        System.out.println("off state");
    }
}
