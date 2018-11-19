package main.java.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kannan on 11/19/2018.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        //message should not be received by the user sending it
        this.users.stream().filter(u -> u != user).forEach(u -> u.receive(msg));
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
