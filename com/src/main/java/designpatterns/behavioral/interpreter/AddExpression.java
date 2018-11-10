package main.java.designpatterns.behavioral.interpreter;

/**
 * Created by Kannan on 11/10/2018.
 */
public class AddExpression implements Expression {

    private final String input;

    public AddExpression(String input) {
        this.input = input;
    }

    @Override
    public int interpret(Context context) {
        return context.add(input);
    }
}
