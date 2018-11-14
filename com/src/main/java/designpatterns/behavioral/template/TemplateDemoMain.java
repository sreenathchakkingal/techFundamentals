package main.java.designpatterns.behavioral.template;

/**
 * Created by Kannan on 11/14/2018.
 */
public class TemplateDemoMain {
    public static void main(String[] args) {
        HouseConstructionTemplate treeHouse = new TreeHouse();
        treeHouse.buildHouse();
    }
}
