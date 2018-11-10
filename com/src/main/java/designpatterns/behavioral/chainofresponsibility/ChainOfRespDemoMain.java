package main.java.designpatterns.behavioral.chainofresponsibility;

import main.java.designpatterns.behavioral.chainofresponsibility.domain.RequestData;

/**
 * Created by Kannan on 11/10/2018.
 */
public class ChainOfRespDemoMain {

    public static void main(String[] args) {
        DBRequestHandler dbRequestHandler = new DBRequestHandler();
        FileRequestHandler fileRequestHandler = new FileRequestHandler();
        CloudRequestHandler cloudRequestHandler = new CloudRequestHandler();

        dbRequestHandler.setNextRequestHandler(fileRequestHandler);
        fileRequestHandler.setNextRequestHandler(cloudRequestHandler);

        RequestData requestData = new RequestData();

        dbRequestHandler.processRequest(requestData);
        System.out.println(requestData);
    }
}
