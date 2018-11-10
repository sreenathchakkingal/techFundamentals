package main.java.designpatterns.behavioral.memento;

/**
 * Created by Kannan on 11/10/2018.
 */
public class MementoDemoMain {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state 1");
        originator.setState("state 2");
        careTaker.add(originator.saveToMemento());

        originator.setState("state 3");
        careTaker.add(originator.saveToMemento());

        originator.setState("state 4");

        System.out.println("Current State: " + originator.getState());

        originator.retriveStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.retriveStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }

}
