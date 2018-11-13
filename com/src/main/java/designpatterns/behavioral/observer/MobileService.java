package main.java.designpatterns.behavioral.observer;

/**
 * Created by Kannan on 11/13/2018.
 */
public class MobileService implements Observer {

    @Override
    public void onUpdate(int stockPriceChange) {
        System.out.println("noptified the stockPriceChange via mobile: "+stockPriceChange);
    }
}
