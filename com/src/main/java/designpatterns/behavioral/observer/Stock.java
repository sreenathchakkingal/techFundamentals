package main.java.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kannan on 11/13/2018.
 */
public class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();

    private String stockName;
    private int stockPriceChange;
    private int startingPrice;

    public Stock(String stockName, int startingPrice) {
        this.stockName = stockName;
        this.startingPrice = startingPrice;
    }

    public void setStockPriceChange(int stockPriceChange)
    {
        this.stockPriceChange = stockPriceChange;
        this.notifyObservers(stockPriceChange);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(int stockPriceChange) {
        for (Observer eachObserver : observers)
        {
            eachObserver.onUpdate(stockPriceChange);
        }
    }
}
