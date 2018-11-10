package main.java.designpatterns.behavioral.chainofresponsibility;

import main.java.designpatterns.behavioral.chainofresponsibility.domain.RequestData;

/**
 * Created by Kannan on 11/10/2018.
 */
public interface RequestHandler {

    public void setNextRequestHandler(RequestHandler requestHandler);

    public boolean processRequest(RequestData requestData);
}
