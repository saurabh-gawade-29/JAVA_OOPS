package javaoopspracticeset;

/*
TODO:
    Create a class BankAccount with private properties:
    accountNumber, accountHolder, balance.
    Provide public getters and setters.
    Add methods for deposit() and withdraw().
*/

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountDetails(String number, String holder, double initialBalance) {
        this.accountNumber = number;
        this.accountHolder = holder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountDetails("123", "Saurabh", 5000);
        account.deposit(1500);
        account.withdraw(2000);
        System.out.println("Balance: " + account.getBalance());
    }
}
