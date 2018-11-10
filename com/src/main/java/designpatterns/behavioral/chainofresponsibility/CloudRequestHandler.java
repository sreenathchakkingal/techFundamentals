package main.java.designpatterns.behavioral.chainofresponsibility;

import main.java.designpatterns.behavioral.chainofresponsibility.domain.RequestData;

/**
 * Created by Kannan on 11/10/2018.
 */
public class CloudRequestHandler implements RequestHandler {


    private RequestHandler requestHandler;

    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {

        this.requestHandler = requestHandler;
    }

    @Override
    public boolean processRequest(RequestData requestData) {
        requestData.setInfoFromCloud("this info was obtained from cloud");
        return this.requestHandler == null || this.requestHandler.processRequest(requestData);

    }
}
