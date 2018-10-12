package main.java.designpatterns.creational.singleton;

/**
 * Created by Kannan on 10/11/2018.
 */
//https://www.geeksforgeeks.org/singleton-design-pattern/
public class SingletonEagerInitialization {

    private static SingletonEagerInitialization singletonEagerInitialization = new SingletonEagerInitialization();

    private SingletonEagerInitialization(){}

    public static SingletonEagerInitialization getInstance()
    {
        return singletonEagerInitialization;
    }
}
