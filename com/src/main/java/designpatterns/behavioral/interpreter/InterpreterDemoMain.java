package main.java.designpatterns.behavioral.interpreter;

/**
 * Created by Kannan on 11/10/2018.
 */
public class InterpreterDemoMain {

    public static void main(String[] args) {
        int i = 28;
        Expression expression = new IntToBinaryExpression(i);

    }
}
