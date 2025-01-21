package day2.question3;

/*
Create a Banking System, where a user can create new account, deposit money, withdraw money
and check the balance.
 */

public class SavingsAccount extends Account {
    private float interest = 5.0f;
    private double maxWithdrawAmountLimit;
    private double minimumBalance;

    public SavingsAccount(String name, long accountNumber, double accountBalance, double minimumBalance) {
        super(name, accountNumber, accountBalance);
        maxWithdrawAmountLimit = accountBalance;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public double getBalance() {
        double currAccountBalance = super.getAccountBalance();
        return currAccountBalance + (currAccountBalance * (interest / 100));
    }

    @Override
    public void withdraw(double withdrawAmount) {
        double accountBalance = super.getAccountBalance();

        if ((withdrawAmount <= maxWithdrawAmountLimit) && (accountBalance - withdrawAmount > minimumBalance)) {
            super.setAccountBalance(accountBalance - withdrawAmount);
            System.out.println("Amount " + withdrawAmount + " withdrawn");
        }
        else {
            System.out.println("Transaction cannot be made because of minimum balance violation or max withdraw amount limit crossed");
        }
    }
}
