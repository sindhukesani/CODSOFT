public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    public boolean withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }
}