package lt.viko.eif.tpetrauskas;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount < 5000) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Transaction cancelled. Max deposit - 5000.00 | Your deposit: " + String.format("%.2f", amount));
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("There is not enough funds.");
        }
    }

    public void printBalance() {
        System.out.println("Your current balance is: " + String.format("%.2f", getBalance()));
    }

    public void transferFrom(BankAccount otherBankAccount, double amount) {
        if(amount <= otherBankAccount.getBalance() && amount > 0) {
            setBalance(otherBankAccount.getBalance() - amount);
        } else {
            System.out.println("Transfer cancelled. You are trying to transfer " + String.format("%.2f", amount) + " units, but only " + String.format("%.2f", getBalance()) + " are available.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
