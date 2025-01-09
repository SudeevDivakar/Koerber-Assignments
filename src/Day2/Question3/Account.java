package Day2.Question3;

/*
Create a Banking System, where a user can create new account, deposit money, withdraw money
and check the balance.
 */

abstract public class Account {
    private String name;
    private long accountNumber;
    private double accountBalance;

    public Account(String name, long accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double newAmount) {
        accountBalance = newAmount;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    abstract public double getBalance();

    abstract public void withdraw(double withdrawAmount);
}
