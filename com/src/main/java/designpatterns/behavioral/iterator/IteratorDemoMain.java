package main.java.designpatterns.behavioral.iterator;

/**
 * Created by Kannan on 11/9/2018.
 */
public class IteratorDemoMain {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.add(new Employee(1, "a"));
        employeeRepository.add(new Employee(2, "b"));
        employeeRepository.add(new Employee(3, "c"));
        employeeRepository.add(new Employee(4, "d"));
        final Iterator<Employee> iterator = employeeRepository.getIterator();
        while(iterator.hasNext())
        {
            final Employee temp = iterator.next();
            System.out.println(temp.getId()+" : " + temp.getName());
        }
    }
}
