package main.java.designpatterns.behavioral.iterator;

/**
 * Created by Kannan on 11/5/2018.
 */
public interface Container<T> {

    public Iterator<T> getIterator();
}
