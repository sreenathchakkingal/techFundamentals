package main.java.designpatterns.creational.adapter.domain;

/**
 * Created by Kannan on 10/22/2018.
 */
public class Mp4Player implements MediaPackage {

    @Override
    public void playFile(String filename) {
        System.out.println("playing mp4 songs");
    }
}
