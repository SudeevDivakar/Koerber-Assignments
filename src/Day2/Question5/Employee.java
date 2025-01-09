package Day2.Question5;

/*
Now we need to implement the Payment system for that company. The company wants to handle
the employee payment and invoice in the same application. As Employee and Invoice are totally
unrelated objects, we cannot use the same class hierarchy; we have to use an interface called
“Payable” and implement that in both Employee class and Invoice class.
 */

public class Employee implements Payable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + salary;
    }

    public double getPayment() {
        return salary;
    }
}
