package main.java.designpatterns.creational.singleton;

/**
 * Created by Kannan on 10/11/2018.
 */
//https://www.geeksforgeeks.org/singleton-design-pattern/
//and since all the implementations of the singleton here has private constructors, this cannot be subclassed.So,
//we dont have to make it final to stay away from being extended.

public class SingletonEagerInitialization {

    private static SingletonEagerInitialization singletonEagerInitialization = new SingletonEagerInitialization();

    private SingletonEagerInitialization(){}

    public static SingletonEagerInitialization getInstance()
    {
        return singletonEagerInitialization;
    }
}
