package main.java.designpatterns.behavioral.mediator;

/**
 * Created by Kannan on 11/19/2018.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
