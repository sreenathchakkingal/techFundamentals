package main.java.designpatterns.structural.proxy;

/**
 * Created by Kannan on 10/27/2018.
 */
public class ProxyInternet implements Internet {

    private Internet realInternet = new RealInternet();
    @Override
    public void connetToHost(String hostUrl) {
        if(hostUrl.contains("abc"))//list of banned sites
        {
            System.out.println("cannot connect");
        }
        else
        {
            realInternet.connetToHost(hostUrl);
        }
    }
}
