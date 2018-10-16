package main.java.designpatterns.creational.builder.methodchaining;

/**
 * Created by Kannan on 10/15/2018.
 */
public class MulithreadingDemo {

    private final Student student = new Student();

    public void runMultipleThreads()
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                student.setName("name1",1000).setAddress("address1").setId(1);
//
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                student.setName("name2",5000).setAddress("address2").setId(2);
            }
        });

        t1.run();
        t2.run();
    }

    public Student getStudent()
    {
        return this.student;
    }

    public static void main(String[] args) {
        for(int i=0; i<3 ; i++)
        {
            final MulithreadingDemo mulithreadingDemo = new MulithreadingDemo();
            mulithreadingDemo.runMultipleThreads();
            System.out.println(mulithreadingDemo.getStudent());
        }
    }

}
