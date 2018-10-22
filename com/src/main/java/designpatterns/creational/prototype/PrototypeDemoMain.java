package main.java.designpatterns.creational.prototype;

/**
 * Created by Kannan on 10/22/2018.
 */
public class PrototypeDemoMain {
    public static void main(String[] args) {
        Employees e = new Employees();

        Employees e1 =(Employees) e.clone();


        Employees e2 =(Employees) e.clone();

    }
}
