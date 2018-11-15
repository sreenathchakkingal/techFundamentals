package main.java.designpatterns.behavioral.strategy;

/**
 * Created by Kannan on 11/15/2018.
 */
public class StrategyDemoMain {
    public static void main(String[] args) {
        Strategy strategy = new AdditionStrategy();
        Context context = new Context(strategy);
        System.out.println(context.executeStrategy(10,20));

        strategy = new MultiplicationStrategy();
        context = new Context(strategy);
        System.out.println(context.executeStrategy(10,20));


    }

}
