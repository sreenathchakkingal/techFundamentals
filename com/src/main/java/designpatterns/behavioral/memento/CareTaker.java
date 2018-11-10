package main.java.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kannan on 11/10/2018.
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento)
    {
        mementoList.add(memento);
    }

    public Memento get(int index)
    {
        return mementoList.get(index);
    }

}
