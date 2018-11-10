package main.java.designpatterns.behavioral.interpreter;

import java.util.List;

/**
 * Created by Kannan on 11/10/2018.
 */
public interface Expression {

    public List<String> interpret(Context context);
}
