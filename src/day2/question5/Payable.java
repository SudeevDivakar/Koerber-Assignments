package day2.question5;

/*
Now we need to implement the Payment system for that company. The company wants to handle
the employee payment and invoice in the same application. As Employee and Invoice are totally
unrelated objects, we cannot use the same class hierarchy; we have to use an interface called
“Payable” and implement that in both Employee class and Invoice class.
 */

public interface Payable {
    public double getPayment();
}
