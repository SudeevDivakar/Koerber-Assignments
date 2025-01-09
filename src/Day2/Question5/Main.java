package Day2.Question5;

/*
Now we need to implement the Payment system for that company. The company wants to handle
the employee payment and invoice in the same application. As Employee and Invoice are totally
unrelated objects, we cannot use the same class hierarchy; we have to use an interface called
“Payable” and implement that in both Employee class and Invoice class.
 */

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("pn", "pd", 10, 300);

        System.out.println("Invoice Details");
        System.out.println(invoice.toString());
        System.out.println("Payment: " + invoice.getPayment());
        System.out.println("*****************");

        Employee employee = new Employee("Sudeev", 1, 10000);
        System.out.println("Employee Details");
        System.out.println(employee.toString());
        System.out.println("Payment: " + employee.getPayment());
        System.out.println("*****************");
    }
}
