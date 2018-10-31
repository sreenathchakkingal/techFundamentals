package main.java.designpatterns.creational.singleton;

/**
 * Created by Kannan on 10/27/2018.
 */
public class SingleDemoMain {

    public static void main(String[] args) {
        SingletonEagerInitialization singletonEagerInitialization1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization singletonEagerInitialization2 = SingletonEagerInitialization.getInstance();
        System.out.println(singletonEagerInitialization1 == singletonEagerInitialization2);

    }


}
