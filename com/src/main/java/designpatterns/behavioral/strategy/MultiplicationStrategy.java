package main.java.designpatterns.behavioral.strategy;

/**
 * Created by Kannan on 11/15/2018.
 */
public class MultiplicationStrategy implements Strategy {


    @Override
    public int doMathematicalOperation(int num1, int num2) {
        return num1 * num2;
    }
}
