package main.java.designpatterns.behavioral.command;

/**
 * Created by Kannan on 11/2/2018.
 */
public class CommandPatterDemoMain {
    public static void main(String[] args) {
        final MusicPlayerPlayMusicCommand playMusicCommand = new MusicPlayerPlayMusicCommand(new MusicPlayer());
        RemoteControl musicPlayerRemoteControl = new RemoteControl(playMusicCommand);
        musicPlayerRemoteControl.buttonPressed();
        //same for lights

    }
}
