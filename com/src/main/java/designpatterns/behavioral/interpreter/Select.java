package main.java.designpatterns.behavioral.interpreter;

import java.util.List;

/**
 * Created by Kannan on 11/10/2018.
 */
public class Select implements Expression{

    private String column;
    private From from;



    @Override
    public List<String> interpret(Context context) {
        return null;
    }
}
