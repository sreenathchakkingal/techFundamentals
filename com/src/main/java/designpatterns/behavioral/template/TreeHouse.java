package main.java.designpatterns.behavioral.template;

/**
 * Created by Kannan on 11/14/2018.
 */
public class TreeHouse extends HouseConstructionTemplate{

    @Override
    protected void buildWalls() {
        System.out.println("building wall using braches of a tree");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("building wall using roots of a tree");
    }
}
