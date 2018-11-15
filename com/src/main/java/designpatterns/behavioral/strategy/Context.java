package main.java.designpatterns.behavioral.strategy;

/**
 * Created by Kannan on 11/15/2018.
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return this.strategy.doMathematicalOperation(num1, num2);
    }
}
