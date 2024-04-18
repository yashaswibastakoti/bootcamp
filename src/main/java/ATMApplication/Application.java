package ATMApplication;

public class Application {

    private Customer customer;
    public Application(Customer customer){
        this.customer = customer;
    }

    //deposit
    public void deposit(double amount){
        customer.setBalance(customer.getBalance()+ amount);
        System.out.println("Deposit Successful. New Balance: " + customer.getBalance());
    }

    //withdraw
    public void withdraw(double amount, int pin){
        if(pin == customer.getPin()){
            if(customer.getBalance() >= amount){
                customer.setBalance(customer.getBalance()- amount);
                System.out.println("Withdrawal successful. New Balance: " + customer.getBalance());
            }else{
                System.out.println("Insufficient Balance");
            }
        } else{
            System.out.println("Incorrect Pin.");
        }
    }
    //check balance
    public void checkBalance(int pin){
        if(pin == customer.getPin()){
            System.out.println("Current balance is: "+ customer.getBalance());
        } else{
            System.out.println("Incorrect Pin!");
        }
    }
}
