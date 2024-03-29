package main.java.designpatterns.structural.adapter;

import main.java.designpatterns.structural.adapter.domain.MediaPackage;
import main.java.designpatterns.structural.adapter.domain.MediaPlayer;

//object adapter
//https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f
public class PackageToPlayerAdapter implements MediaPlayer{

    private MediaPackage mediaPackage;

    public PackageToPlayerAdapter(MediaPackage mediaPackage)
    {
        this.mediaPackage=mediaPackage;
    }

    @Override
    public void play(String filename) {
        this.mediaPackage.playFile(filename);
    }
}
