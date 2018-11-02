package main.java.designpatterns.structural.command;

/**
 * Created by Kannan on 10/31/2018.
 */
public class MusicPlayer{

    public void switchOn()
    {
        System.out.println("Music player switched on");
    }

    public void switchOff()
    {
        System.out.println("Music player switched off");
    }

    public void increaseVolume()
    {
        System.out.println("Music player increase volume");
    }

    public void chooseSource(String source)
    {
        System.out.println("Music player: "+source);
    }
}
