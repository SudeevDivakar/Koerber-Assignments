package day2.question4;

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

public class SalariedEmployee extends Employee {
    public SalariedEmployee(double fixedSalary) {
        super(fixedSalary, 1);
    }
}
