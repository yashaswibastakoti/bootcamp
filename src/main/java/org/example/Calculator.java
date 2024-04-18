package org.example;

//create a class called calculator and write methods with parameters to do all the calculations.

public class Calculator {

    //main method to test the arithmetic operations
    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 10));
        System.out.println("Subtraction: " + subtract(5, 10));
        System.out.println("Multiplication: " + multiply(5,10));
        System.out.println("Division: " + divide(5.0, 10.0));
        System.out.println("Modulus:" + modulus(5, 10));
        System.out.println("Increment:" + increment(5));
        System.out.println("Decrement:" + decrement(5));
    }

    //method to add two numbers
    public static int add(int a, int b) {

        return a + b;
    }

    //method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    //method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    //method to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }

    //method to find the modulus of two numbers
    public static int modulus(int a, int b) {
        return a % b;
    }

    //method to increment a number
    public static int increment(int a) {
        return ++a; //pre-increment to increment and then return value
    }

    //method to decrement a number
    public static int decrement(int a){
        return --a; //pre-decrement to decrement and then return value
    }
}