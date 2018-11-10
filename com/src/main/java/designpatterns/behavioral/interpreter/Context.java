package main.java.designpatterns.behavioral.interpreter;

/**
 * Created by Kannan on 11/10/2018.
 */
public class Context {

    public int add(String input)
    {
        int[] numbers = parseNumbers(input);
        return (numbers[0] + numbers[1]);
    }

    public int subtract(String input)
    {
        int[] numbers = parseNumbers(input);
        return (numbers[1] - numbers[0]);
    }

    private int[] parseNumbers(String input) {
        String[] tokens = input.replaceAll("[^0-9]", " ").replaceAll("( )+", " ").trim().split(" ");
        return new int[]{Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])};
    }
}
