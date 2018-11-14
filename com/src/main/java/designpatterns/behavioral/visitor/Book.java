package main.java.designpatterns.behavioral.visitor;

/**
 * Created by Kannan on 11/14/2018.
 */
public class Book implements Item{

    private final String bookName;
    private final int price;

    public Book(String bookName,int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int addToShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCart.visit(this);
    }
}
