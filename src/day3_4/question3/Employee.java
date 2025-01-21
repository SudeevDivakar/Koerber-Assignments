package day3_4.question3;

import java.io.Serializable;

/*
Write a program to serialize and deserialize an object of Employee class. Employee class has the following
members.
 */

public class Employee implements Serializable {
    private int id;
    private String name;
    private Address address;
    private transient double salary;

    public Employee(int id, String name, Address address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public void display() {
        String output = new StringBuilder()
                .append("ID: ").append(id).append("\n")
                .append("Name: ").append(name).append("\n")
                .append("Address: ").append(address.toString()).append("\n")
                .append("Salary: ").append(salary).toString();
        System.out.println(output);
    }
}
