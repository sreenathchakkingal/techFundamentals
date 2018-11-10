package main.java.designpatterns.behavioral.interpreter;

/**
 * Created by Kannan on 11/10/2018.
 */
public class SubtractExpression implements Expression {

    private final String input;

    public SubtractExpression(String input) {
        this.input = input;
    }

    @Override
    public int interpret(Context context) {
        return context.subtract(input);
    }
}
