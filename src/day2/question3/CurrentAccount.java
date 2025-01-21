package day2.question3;

/*
Create a Banking System, where a user can create new account, deposit money, withdraw money
and check the balance.
 */

public class CurrentAccount extends Account {
    private int tradeLicenseNumber;
    private double overdraft;

    public CurrentAccount(String name, long accountNumber, double accountBalance, int tradeLicenseNumber, double overdraft) {
        super(name, accountNumber, accountBalance);
        this.tradeLicenseNumber = tradeLicenseNumber;
        this.overdraft = overdraft;
    }

    @Override
    public double getBalance() {
        return super.getAccountBalance();
    }

    @Override
    public void withdraw(double withdrawAmount) {
        double availableBalance = getBalance() + overdraft;
        if (withdrawAmount <= availableBalance) {
            super.setAccountBalance(getBalance() - withdrawAmount);
            System.out.println("Amount " + withdrawAmount + " withdrawn");
        }
        else {
            System.out.println("Not enough account balance to withdraw");
        }
    }
}
