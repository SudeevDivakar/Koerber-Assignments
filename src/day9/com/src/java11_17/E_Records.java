package java11_17;

interface Employable{
    public double getNetSalary();
}

record Employee(int id, String firstName, String lastName, double salary) implements Employable {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double getNetSalary() {
        return 12 * salary;
    }
}

public class E_Records {
    public static void main(String[] args) {
        Employee e = new Employee(1, "sudeev", "divakar", 200);
        System.out.println(e.getNetSalary());
    }
}
