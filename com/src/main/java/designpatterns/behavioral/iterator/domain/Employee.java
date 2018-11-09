package main.java.designpatterns.behavioral.iterator.domain;

/**
 * Created by Kannan on 11/5/2018.
 */
public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
