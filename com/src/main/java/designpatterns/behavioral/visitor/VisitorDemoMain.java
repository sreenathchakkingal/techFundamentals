package main.java.designpatterns.behavioral.visitor;

/**
 * Created by Kannan on 11/14/2018.
 */
public class VisitorDemoMain {
    public static void main(String[] args) {
        ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
        int totalPrice = 0;

        Apple apple = new Apple(100,2);
        totalPrice = totalPrice + apple.addToShoppingCart(shoppingCart);

        Book book = new Book("demo book",1000);
        totalPrice = totalPrice + book.addToShoppingCart(shoppingCart);

        System.out.println(totalPrice);


    }

}
