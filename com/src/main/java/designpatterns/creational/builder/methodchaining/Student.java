package main.java.designpatterns.creational.builder.methodchaining;

/**
 * Created by Kannan on 10/15/2018.
 */
public class Student {
    private int id;
    private String name;
    private String address;

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name, int timeSeconds) {
        someTimeConsumingThing(timeSeconds);
        this.name = name;
        return this;
    }

    public Student setName(String name) {
        return this.setName(name, 0);
    }

    private void someTimeConsumingThing(int timeSeconds) {
        try {
            Thread.sleep(timeSeconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Student setAddress(String address) {
        return this.setAddress(address, 0);
    }

    public Student setAddress(String address, int timeSeconds) {
        someTimeConsumingThing(timeSeconds);
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
