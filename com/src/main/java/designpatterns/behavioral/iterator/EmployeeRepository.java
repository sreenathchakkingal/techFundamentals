package main.java.designpatterns.behavioral.iterator;

import main.java.designpatterns.behavioral.iterator.domain.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kannan on 11/5/2018.
 */
public class EmployeeRepository implements Container {

    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee)
    {
        employees.add(employee);
    }

    public void add(Employee... employeeVarArgs)
    {
        for (Employee employee : employeeVarArgs)
        {
            employees.add(employee);
        }
    }



    @Override
    public Iterator getIterator() {
        return new EmpoyeeIterator();
    }
}
