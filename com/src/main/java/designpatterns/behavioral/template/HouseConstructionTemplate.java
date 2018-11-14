package main.java.designpatterns.behavioral.template;

/**
 * Created by Kannan on 11/14/2018.
 */
public abstract class HouseConstructionTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        System.out.println("House is built.");
    }

    protected abstract void buildWalls();

    protected void buildPillars(){
        System.out.println("default implementation of building pillar");
    }

    protected abstract void buildFoundation();


}
