package main.java.designpatterns.creational.adapter.domain;

/**
 * Created by Kannan on 10/22/2018.
 */
public class Mp3Player implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("playing mp3 songs");
    }
}
