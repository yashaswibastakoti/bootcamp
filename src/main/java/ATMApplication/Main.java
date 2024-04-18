package ATMApplication;
import java.util.Scanner;

/*
Objective: Create an ATM application in java that incorporates OOP principles,
        including encapsulation, inheritance, polymorphism, and abstraction.

Requirements:
Customer class:
Create a Customer class with the following attributes:

Name
Account Number
Balance
PIN Number
Implement appropriate constructors and methods to set up and get customer information.

ATM Class:
Implement an ATM class which includes methods for various transactions:

Deposit
Withdrawal
Balance Inquiry
Ensure that before performing any transaction, the ATM verifies the customer's PIN.

Encapsulation:
Encapsulate the attributes of the Customer class by making them private and providing getter and setter methods
to access and modify them.

Inheritance:
Implement inheritance if needed, for example, you might have a savingAccount class and a CheckingAccount class
that inherits from the Customer class.

Polymorphism:
Implement polymorphism by creating multiple methods with the same name but different parameters lists,
for example, deposit() and deposit(amount) methods.

Abstraction:
Use abstraction to hide the complexity of the internal processes from the user.
For example, the ATM class should hide the implementation.

Error handling:
Implement appropriate error handling mechanisms, for instance, handling insufficient balance during withdrawals
or invalid PIN Number.

Additional features(Optimal):
Allow the user to change their PIN.
Implement security features such as a maximum number of incorrect PIN attempts before locking the account.
Provide a transaction history feature.
Implement multi-threading for concurrent transactions.

//what are the flaws of the application?
//how can we solve it to add more use cases?
1) there is only 1 customer, as a user I should be able to create customers,
so there should be more switch cases,
//user should be able to create a customer, then select a customer, , pin for the customer, deposit. withdraw,
 check balances, transfer between customers.
 ask again if they want to do any more transactions.
 //if not then there should be an option to exit the application.
2)
 */
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("John", 10000, 1234566789, 1234);
        Application application = new Application(customer);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my banking application.");

        boolean exitRequested = false;
        while (!exitRequested) {
            System.out.println("Enter your PIN to continue or type 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                exitRequested = true;
                continue;
            }
        /*
        while (continueTransactions) {

            System.out.println("1. Create Customer");
            System.out.println("2. Select Customer");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);



            int option = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (pin == customer.getPin()) {
                System.out.println("Pin is correct. choose an option: ");
                System.out.println("1.Deposit");
                System.out.println("2.Withdrawal");
                System.out.println("3.Check Balance");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        System.out.print("Enter the amount to be deposited: ");
                        double depositAmount = scanner.nextDouble();
                        application.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        application.withdraw(withdrawAmount, pin);
                        break;

                    case 3:
                        System.out.print("Enter the pin to check balance: ");
                        int checkBalancePin = scanner.nextInt();
                        application.checkBalance(checkBalancePin);
                        break;
                    default:
                        System.out.println("Invalid Option!");
                }
            } else {
                System.out.println("Incorrect pin!");
            }
        }
            System.out.println("Thank you. Bye");
            scanner.close();
    }
}
*/
        }
    }
}