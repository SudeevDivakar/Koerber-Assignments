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

public class Company implements Runnable {
    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.addAmount(1000);
        }
    }
}
