package Day2.Question4;
import java.util.ArrayList;
import java.util.Scanner;

/*
You need to implement the Employee records of a company. The Company has 3 types of
employee;
1) Salaried employee-> This type of employees are paid a fixed weekly salary regardless of the number
of hours worked.
2) Hourly employee -> They are paid by the hour. They have an hourly rate and their payment will
depend on how many hours they worked. The more they work, the more they will be paid. So, the
salary will be [hour worked per week* hourly rate].
3) Commission employee-> They are paid a percentage of their sales. If their percentage is “a” and
total weekly sale is ”b”, the total weekly salary will be [a*b/100];
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        while(true) {
            System.out.println("Enter Option");
            System.out.println("1. Add Salaried Employee");
            System.out.println("2. Add Hourly Employee");
            System.out.println("3. Add Commission Employee");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter Fixed Salary");
                double fixedSalary = sc.nextDouble();
                employees.add(new SalariedEmployee(fixedSalary));
            }
            else if (choice == 2) {
                System.out.println("Enter Hourly Rate");
                double hourlyRate = sc.nextDouble();
                System.out.println("Enter Hours");
                int hours = sc.nextInt();
                employees.add(new HourlyEmployee(hourlyRate, hours));
            }
            else if (choice == 3) {
                System.out.println("Enter Percentage");
                float percentage = sc.nextFloat();
                System.out.println("Enter Total Weekly Sales");
                double totalWeeklySales = sc.nextDouble();
                employees.add(new CommissonEmployee(percentage, totalWeeklySales));
            }
            else {
                break;
            }
        }

        // Increase salaries of Commission Employees by 10% (ID = 3)
        // Employee Type and Increase % can be inputted from the user
        System.out.println("Commission Employees Initial Salary:");
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == 3) {
                System.out.println(employee.getSalary());
            }
        }
        System.out.println("********************");
        System.out.println("Commission Employees Salaries After Increase:");
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == 3) {
                employee.increaseSalary(10);
                System.out.println(employee.getSalary());
            }
        }

    }
}
