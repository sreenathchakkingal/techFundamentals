package main.java.designpatterns.behavioral.visitor;

/**
 * Created by Kannan on 11/14/2018.
 */
public interface ShoppingCart {

    public int visit(Book book);
    public int visit(Apple apple);

}
