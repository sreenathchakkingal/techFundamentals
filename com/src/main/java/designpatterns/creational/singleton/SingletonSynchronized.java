package main.java.designpatterns.creational.singleton;

/**
 * Created by Kannan on 10/11/2018.
 */
public class SingletonSynchronized {

    private static SingletonSynchronized singletonSynchronized = null;

    private SingletonSynchronized (){}

    public static synchronized SingletonSynchronized getInstance()
    {
        if(singletonSynchronized==null)
        {
            singletonSynchronized = new SingletonSynchronized();
        }
        return  singletonSynchronized;
    }
}
