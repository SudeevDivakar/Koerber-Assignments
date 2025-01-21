package day2.question1;

/*
Implement following UML diagram, Write a program to test circle class.
*/

// Test File for Employee.java

public class Main {
    public static void main(String[] args) {
        Employee sudeev = new Employee(1, "Sudeev", "Divakar", 2000);
        System.out.println("Employee Details:");
        System.out.println("ID: " + sudeev.getID() + ", First Name: " + sudeev.getFirstName() + ", Last Name: " + sudeev.getLastName() + ", Salary: " + sudeev.getSalary());
        System.out.println("Full name: " + sudeev.getName());
        System.out.println("Salary: " + sudeev.getSalary());
        System.out.println("Annual Salary: " + sudeev.getAnnualSalary());

        //Setting Salary
        sudeev.setSalary(3000);
        System.out.println("Changed salary: " + sudeev.getSalary());

        //Raising Salary
        System.out.println("Raised Salary: " + sudeev.raiseSalary(10));

        //toString method
        System.out.println("Employee data as string: " + sudeev.toString());
    }
}
