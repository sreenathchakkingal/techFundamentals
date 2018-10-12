package main.java.designpatterns.creational.abstractfactory;

/**
 * Created by Kannan on 10/11/2018.
 */
public class Horse implements Animal {

    @Override
    public String getSound() {
        return "neigh-neigh";
    }
}
