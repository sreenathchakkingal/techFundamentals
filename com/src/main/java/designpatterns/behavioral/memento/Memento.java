package main.java.designpatterns.behavioral.memento;

/**
 * Created by Kannan on 11/10/2018.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
