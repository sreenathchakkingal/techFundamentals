package main.java.designpatterns.behavioral.command;

/**
 * Created by Kannan on 11/2/2018.
 */
public class RemoteControl {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void buttonPressed()
    {
        this.command.execute();
    }
}
