package main.java.designpatterns.behavioral.mediator;

/**
 * Created by Kannan on 11/19/2018.
 */
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

    @Override
    public String toString() {
        return "User{" +
                "mediator=" + mediator +
                ", name='" + name + '\'' +
                '}';
    }
}
