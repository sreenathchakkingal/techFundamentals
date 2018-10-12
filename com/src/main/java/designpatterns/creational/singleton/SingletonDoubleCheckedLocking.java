package main.java.designpatterns.creational.singleton;

/**
 * Created by Kannan on 10/11/2018.
 */
public class SingletonDoubleCheckedLocking {

    private static volatile SingletonDoubleCheckedLocking singletonDoubleCheckedLocking = null;

    private SingletonDoubleCheckedLocking(){}

    public static SingletonDoubleCheckedLocking getInstance()
    {
        if (singletonDoubleCheckedLocking==null)
        {
            synchronized (SingletonDoubleCheckedLocking.class)
            {
                singletonDoubleCheckedLocking=new SingletonDoubleCheckedLocking();
            }
        }
        return singletonDoubleCheckedLocking;
    }
}
