package ATMApplication;

public class Customer {

    private String name;
    private int accountNumber;
    private double balance;
    private int pin;

    public Customer(String name, double balance, int accountNumber, int pin){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
}

