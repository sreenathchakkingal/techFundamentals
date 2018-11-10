package main.java.designpatterns.behavioral.memento;

/**
 * Created by Kannan on 11/10/2018.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveToMemento()
    {
        return new Memento(this.state);
    }

    public void retriveStateFromMemento(Memento memento)
    {
        this.state= memento.getState();
    }
}
