package main.java.designpatterns.structural.composite;

/**
 * Created by Kannan on 10/24/2018.
 */
public class CompositeDemoMain {

    public static void main(String[] args) {
        Office blrOffice = new BlrOffice("koramangala office");
        Office mumbaiOffice= new MumbaiOffice("bandra office");
        HeadOffice headOffice = new HeadOffice("kerala office");
        headOffice.addOffice(blrOffice);
        headOffice.addOffice(mumbaiOffice);

        blrOffice.printOfficeName();
        mumbaiOffice.printOfficeName();
        headOffice.printOfficeName();

    }
}
