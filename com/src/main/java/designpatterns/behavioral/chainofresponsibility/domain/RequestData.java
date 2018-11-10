package main.java.designpatterns.behavioral.chainofresponsibility.domain;

/**
 * Created by Kannan on 11/10/2018.
 */
public class RequestData {

    private String infoFromDb;
    private String infoFromCloud;
    private String infoFromFile;

    public void setInfoFromDb(String infoFromDb) {
        this.infoFromDb = infoFromDb;
    }

    public void setInfoFromCloud(String infoFromCloud) {
        this.infoFromCloud = infoFromCloud;
    }

    public void setInfoFromFile(String infoFromFile) {
        this.infoFromFile = infoFromFile;
    }

    public String getInfoFromDb() {
        return infoFromDb;
    }

    public String getInfoFromCloud() {
        return infoFromCloud;
    }

    public String getInfoFromFile() {
        return infoFromFile;
    }



    @Override
    public String toString() {
        return "RequestData{" +
                "infoFromDb='" + infoFromDb + '\'' +
                ", infoFromCloud='" + infoFromCloud + '\'' +
                ", infoFromFile='" + infoFromFile + '\'' +
                '}';
    }
}
