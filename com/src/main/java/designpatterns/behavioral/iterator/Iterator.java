package main.java.designpatterns.behavioral.iterator;

/**
 * Created by Kannan on 11/5/2018.
 */
public interface Iterator<T> {

    public boolean hasNext();
    public T next();
}
