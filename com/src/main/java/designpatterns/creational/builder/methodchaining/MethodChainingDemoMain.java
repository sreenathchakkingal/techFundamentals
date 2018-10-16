package main.java.designpatterns.creational.builder.methodchaining;

/**
 * Created by Kannan on 10/15/2018.
 */
public class MethodChainingDemoMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setId(1).setName("Ram").setAddress("Noida");
        student2.setId(2).setName("Shyam").setAddress("Delhi");

        System.out.println(student1);
        System.out.println(student2);
    }

}
