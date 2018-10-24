package main.java.designpatterns.structural.bridge.composite;

/**
 * Created by Kannan on 10/24/2018.
 */
public class BlrOffice implements Office {

    private String officeName;

    public BlrOffice(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public void printOfficeName() {
        System.out.println(this.officeName);
    }
}
