package main.java.designpatterns.behavioral.interpreter;

/**
 * Created by Kannan on 11/10/2018.
 */
public class InterpreterDemoMain {

    private Context context = null;

    public static void main(String[] args) {
        final Context context = new Context();
        Expression addExpression = new AddExpression("add 10 to 15");
        Expression subExpression = new SubtractExpression("subtract 10 from 15");
        System.out.println(addExpression.interpret(context));
        System.out.println(subExpression.interpret(context));
    }
}
