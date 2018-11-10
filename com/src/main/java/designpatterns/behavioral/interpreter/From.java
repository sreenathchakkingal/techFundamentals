package main.java.designpatterns.behavioral.interpreter;

import java.util.List;

/**
 * Created by Kannan on 11/10/2018.
 */
public class From implements Expression{

    private String tableName;
    private Where where;

    @Override
    public List<String> interpret(Context context) {
        return null;
    }
}
