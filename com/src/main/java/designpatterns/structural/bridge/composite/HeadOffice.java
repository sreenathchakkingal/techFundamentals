package main.java.designpatterns.structural.bridge.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kannan on 10/24/2018.
 */
public class HeadOffice implements Office {

    private List<Office> officeList = new ArrayList();
    private String officeName;

    public HeadOffice(String officeName) {
        this.officeName = officeName;
    }

    public void addOffice(Office office)
    {
        officeList.add(office);
    }

    @Override
    public void printOfficeName() {
        System.out.println(this.officeName);
        System.out.println("other sub offices");
        for (Office eachOffice : officeList)
        {
            eachOffice.printOfficeName();
        }
    }
}
