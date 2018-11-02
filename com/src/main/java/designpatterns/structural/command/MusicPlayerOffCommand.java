package main.java.designpatterns.structural.command;

/**
 * Created by Kannan on 11/2/2018.
 */
public class MusicPlayerOffCommand implements Command{

    private MusicPlayer musicPlayer;

    public MusicPlayerOffCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.switchOff();
    }
}
