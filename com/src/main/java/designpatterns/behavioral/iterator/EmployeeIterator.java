package main.java.designpatterns.behavioral.iterator;

/**
 * Created by Kannan on 11/5/2018.
 */
public class EmployeeIterator implements Iterator {

    private Employee[] employees = null;
    private int pointer=0;

    public EmployeeIterator(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return pointer<employees.length && employees[pointer] != null;
    }

    @Override
    public Object next() {
        return employees[pointer++];
    }
}
