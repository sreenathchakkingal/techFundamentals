package main.java.designpatterns.structural.proxy;

/**
 * Created by Kannan on 10/27/2018.
 */
public class RealInternet implements Internet {

    @Override
    public void connetToHost(String hostUrl) {
        System.out.println("connected to host: "+ hostUrl);

    }
}
