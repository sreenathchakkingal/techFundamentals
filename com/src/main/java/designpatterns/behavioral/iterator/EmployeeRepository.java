package main.java.designpatterns.behavioral.iterator;

/**
 * Created by Kannan on 11/5/2018.
 */
public class EmployeeRepository implements Container<Employee> {

    private Employee[] employees = new Employee[10];
    int pointer = 0;
    public void add(Employee employee)
    {
        employees[pointer++]=employee;
    }

    public void add(Employee... employeeVarArgs)
    {
        for (Employee employee : employeeVarArgs)
        {
            add(employee);
        }
    }

    @Override
    public Iterator<Employee> getIterator() {
        return new EmployeeIterator(employees);
    }
}
