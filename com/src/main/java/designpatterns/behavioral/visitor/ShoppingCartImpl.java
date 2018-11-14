package main.java.designpatterns.behavioral.visitor;

/**
 * Created by Kannan on 11/14/2018.
 */
//Visitors are also valuable if you have to perform a number of unrelated operations across the classes.
public class ShoppingCartImpl implements ShoppingCart{

    private static float DISCOUNT = 0.1f;

    @Override
    public int visit(Book book) {
        System.out.println("adding book and no discount");
        return book.getPrice();
    }

    @Override
    public int visit(Apple apple) {
        System.out.println("adding apple and has discount");
        return (int) (apple.getPricePerKg() * apple.getQty() * (1- DISCOUNT));
    }
}
