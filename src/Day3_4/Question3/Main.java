package Day3_4.Question3;

import java.io.*;

/*
Write a program to serialize and deserialize an object of Employee class. Employee class has the following
members.
 */

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Bengaluru", "Karnataka");
        Employee employee = new Employee(101, "Sudeev", address, 75000);

        //Serialize employee
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question3\\data.txt"))) {
            oos.writeObject(employee);
            System.out.println("Employee serialized :D");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Deserialize employee
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question3\\data.txt"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Deserialized Employee object:");
            deserializedEmployee.display();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
