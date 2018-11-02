package main.java.designpatterns.structural.command;

/**
 * Created by Kannan on 11/2/2018.
 */
public class MusicPlayerPlayMusicCommand implements Command{

    private MusicPlayer musicPlayer;

    public MusicPlayerPlayMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.switchOn();
        this.musicPlayer.increaseVolume();
        this.musicPlayer.chooseSource("Radio");
    }
}
