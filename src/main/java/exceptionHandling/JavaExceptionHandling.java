package exceptionHandling;
import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        d(10, 0);
        string();
        numberFormat();
        checkAge();
        find7Th();
        checkPassword();

        try{
            checkNumber(-5);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void d(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("this is code");
    }

    public static void string() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception:  " + e.getMessage());
        }
    }

    public static void numberFormat() {
        try {
            String str = "hello Java";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    // Write a program that prompts the user to input age and check if the user is eligible to vote or not.
    //  Check for negative int and non-numeric values.
    public static void checkAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:  ");

        try {
            int age = scanner.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            } else if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote yet.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. please try again. ");
        }
        scanner.close();
    }
  //  Given an array of 5 numbers, find me the 7th number of the array.
 public static void find7Th(){
        int[] arr = {1,2,3,4,5};
        try{
            int seventh = arr[7];
            System.out.println(seventh);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
 }
   // Write  a program that prompts the user to input string password and check if it has capital letter and a number.
    public static void checkPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");

        try{
            String password = scanner.next();
            if(password.matches(".*[A-Z]*") && password.matches(".*\\d.*")){
                System.out.println("Password is valid.");
            }else{
                System.out.println("Password is not valid.");
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid input, please try again.");
        }
        scanner.close();
    }

    //using throws
    public static void checkNumber(int number) throws IllegalArgumentException{
        if(number < 0){
            throw new IllegalArgumentException("Number can not be negative");
        }else{
            System.out.println("number is : " + number);
        }
    }
}

