package main.java.designpatterns.behavioral.state;

/**
 * Created by Kannan on 11/16/2018.
 */
public class StatePatternDemoMain {

    public static void main(String[] args) {
        final State offState = new OffState();
        final State onState = new OnState();

        TvContext tvContext = new TvContext(offState);
        tvContext.performActionBasedOnState();

        tvContext.setState(onState);
        tvContext.performActionBasedOnState();


    }
}
