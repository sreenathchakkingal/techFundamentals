package main.java.designpatterns.behavioral.state;

/**
 * Created by Kannan on 11/16/2018.
 */
public class OnState implements State {

    @Override
    public void doAction() {
        System.out.println("on state");
    }
}
