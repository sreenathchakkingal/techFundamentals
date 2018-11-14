package main.java.designpatterns.behavioral.visitor;

/**
 * Created by Kannan on 11/14/2018.
 */
public class Apple implements Item{

    private int pricePerKg;
    private int qty;

    public Apple(int pricePerKg, int qty) {
        this.pricePerKg = pricePerKg;
        this.qty = qty;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public int addToShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCart.visit(this);
    }
}
