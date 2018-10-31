package main.java.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kannan on 10/22/2018.
 */
public class Employees implements Cloneable{

    private List<String> employees = new ArrayList();

    public Employees()
    {
        //picking up the employee list is a costly operation say by reading a db , and then populating the array list
        this.employees =  getListOfEmployeesFromDb();
    }

    private List<String> getListOfEmployeesFromDb() {
        //costly operation - lets say this takes the data from db
        System.out.println("costly operation");
        List<String> listFromDb = new ArrayList<>();
        listFromDb.add("employee1");
        listFromDb.add("employee2");
        listFromDb.add("employee3");

        return listFromDb;
    }

    // this is not a costly operation as this does not involve any db connection
    public List<String> getEmployees() {
        return this.employees;
    }

    public Employees(List<String> employees)
    {
        this.employees=employees;
    }

    @Override
    public Object clone()
    {
        System.out.println("cheap operation");
        return new Employees(getEmployees());
    }

}
