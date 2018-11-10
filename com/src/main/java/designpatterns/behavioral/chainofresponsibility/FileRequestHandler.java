package main.java.designpatterns.behavioral.chainofresponsibility;

import main.java.designpatterns.behavioral.chainofresponsibility.domain.RequestData;

/**
 * Created by Kannan on 11/10/2018.
 */
public class FileRequestHandler implements RequestHandler {


    private RequestHandler requestHandler;

    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {

        this.requestHandler = requestHandler;
    }

    @Override
    public boolean processRequest(RequestData requestData) {
        requestData.setInfoFromFile("this info was obtained from file");
        return this.requestHandler == null || this.requestHandler.processRequest(requestData);

    }
}
