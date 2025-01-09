package Day2.Question3;

/*
Create a Banking System, where a user can create new account, deposit money, withdraw money
and check the balance.
 */

public class Main {
    public static void main(String[] args) {
        CurrentAccount account1 = new CurrentAccount("Sudeev", 1, 10000, 1, 2000);
        SavingsAccount account2 = new SavingsAccount("Person2", 2 ,15000, 1000);

        System.out.println("Current Account Testing");
        System.out.println("Initial Balance");
        System.out.println(account1.getBalance());
        System.out.println("***************");

        //Depositing
        System.out.println("Depositing 20000");
        account1.deposit(20000);
        System.out.println("Balance after depositing");
        System.out.println(account1.getBalance());
        System.out.println("***************");

        //Invalid withdrawal
        System.out.println("Withdrawing 34000 (not possible)");
        account1.withdraw(34000);
        //Valid withdrawal
        System.out.println("Withdrawing 31000 (possible because of 2000 overdraft)");
        account1.withdraw(31000);
        System.out.println("Amount after withdrawing: " + account1.getBalance());
        System.out.println("****************");


        System.out.println("Savings Account Testing");
        System.out.println("Initial Balance");
        System.out.println(account2.getBalance());
        System.out.println("****************");

        //Invalid withdrawal
        System.out.println("Withdrawing 15000 (not possible because minimum balance violated)");
        account2.withdraw(15000);
        //Valid withdrawal
        System.out.println("Withdrawing 5000 (possible)");
        account2.withdraw(5000);
        System.out.println("Amount after withdrawing: " + account2.getBalance());
        System.out.println("****************");
    }
}
