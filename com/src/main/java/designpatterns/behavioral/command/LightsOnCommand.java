package main.java.designpatterns.behavioral.command;

/**
 * Created by Kannan on 10/31/2018.
 */
public class LightsOnCommand implements Command {

    private Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
