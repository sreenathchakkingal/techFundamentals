package main.java.designpatterns.behavioral.observer;

/**
 * Created by Kannan on 11/13/2018.
 */
public class ObserverDemoMain {

    public static void main(String[] args) {
        Stock stock = new Stock("stockNameA",20);
        stock.registerObserver(new EmailService());
        stock.registerObserver(new MobileService());
        stock.setStockPriceChange(10);
        stock.setStockPriceChange(40);
    }
}
