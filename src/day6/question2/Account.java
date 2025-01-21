package day6.question2;

/*
Synchronizing a method,In this lab we will learn how to use synchronization in
Java, that is, the use of the synchronized keyword to control the concurrent access to a
method. Only one execution thread will access one of the methods of an object declared with
the synchronized keyword. If another thread tries to access any method declared with the
synchronized keyword of the same object, it will be suspended until the first thread finishes
the execution of the method.

public class Account {
private double balance;
//getter setter
public void addAmount(double amount) {
//
}
public void subtractAmount(double amount) {
//
}
}
Now same account object is used by Bank and Company class, bank trying to subtract Rs 1000 , 100 time
and
Company trying to deposit Rs 1000, 100 time(refer lab code)
Now we need to ensure that total amount must be consistent (Apply synchronization method and block)
 */

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void addAmount(double amount) {
        System.out.println(new StringBuilder(Thread.currentThread().getName())
                .append(" added Rs. ")
                .append(amount)
                .append(". Current bank balance = ")
                .append(balance + amount).toString());
        balance += amount;
        notify();
    }

    public synchronized void subtractAmount(double amount) {
        while (amount > balance) {
            try {
                wait();
            }
            catch (InterruptedException ex) {
                System.out.println("Interrupted");
            }
        }

        System.out.println(new StringBuilder(Thread.currentThread().getName())
                .append(" withdrew Rs. ")
                .append(amount)
                .append(". Current bank balance = ")
                .append(balance - amount).toString());
        balance -= amount;
        notify();
    }
}
