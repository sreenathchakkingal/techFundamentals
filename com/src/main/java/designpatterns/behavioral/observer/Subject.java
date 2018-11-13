package main.java.designpatterns.behavioral.observer;

/**
 * Created by Kannan on 11/13/2018.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void notifyObservers(int stockPriceChange);
}
