package main.java.designpatterns.behavioral.template;

/**
 * Created by Kannan on 11/14/2018.
 */
public class ConcreteHouse extends HouseConstructionTemplate{

    @Override
    protected void buildPillars() {
        System.out.println("can't rely on default implementation. Building pillars using double layer of concrete");
    }

    @Override
    protected void buildWalls() {
        System.out.println("building wall using braches of a tree");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("building wall using roots of a tree");
    }
}
