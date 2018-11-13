package main.java.designpatterns.behavioral.observer;

/**
 * Created by Kannan on 11/13/2018.
 */
public class EmailService implements Observer {

    @Override
    public void onUpdate(int stockPriceChange) {
        System.out.println("noptified the stockPriceChange via email: "+stockPriceChange);

    }
}
