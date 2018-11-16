package main.java.designpatterns.behavioral.state;

/**
 * Created by Kannan on 11/16/2018.
 */
public class TvContext {

    private State state;

    public TvContext(State state) {
        this.state = state;
    }

    public void performActionBasedOnState()
    {
        this.state.doAction();
    }

    public void setState(State state) {
        this.state = state;
    }
}
