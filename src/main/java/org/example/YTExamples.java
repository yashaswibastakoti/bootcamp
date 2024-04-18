package org.example;

import java.util.Scanner;

public class YTExamples {

    public static void main(String[] args) {
//Basic questions
//Write a program to print "Hello, World!" to the console.
//        System.out.println("Hello, World!");

//Write a program to print numbers from 1 to 10.
//        for (int i = 1; i < 10; i++) {
//            System.out.print(i);
//        }
////Write a program to print even numbers from 1 to 20.
//        for (int i = 1; i < 20; i++) {
//            if (i%2 ==0)
//                System.out.print(i);
//        }

////Write a program to print if the given number is odd or even.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int inputNumber = scanner.nextInt(); //storing user input
//
//        if(inputNumber % 2 == 0){
//            System.out.println(inputNumber+ " is even");
//        } else{
//            System.out.println( inputNumber+ "is odd");
//        }
//        scanner.close();

//Write a program to add two number entered by user.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter first number: ");
//        int num1 = scanner.nextInt(); //storing user input
//
//        System.out.println("enter second number: ");
//        int num2 = scanner.nextInt(); //storing user input
//
//        int sum = num1+num2;
//        System.out.println(sum);
//
//        scanner.close();

//Write a program to print the sum of numbers from 1 to 100.
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }
//            System.out.print(sum);

//Write a program to print the Fibonacci series up to a given number of terms.

//Write a program to print the multiplication table of a given number. (1*1 =1)
//        Scanner scanner = new Scanner(System.in);
//        // ask the user to input number.
//        System.out.println("Enter the number to print multiplication table: ");
//        int number = scanner.nextInt();
//
//        System.out.println("Multiplication table of the given number is: ");
//        for(int i=1; i<=10;i++){
//            System.out.println(number+ "*"+ i + "=" + (number*i));
//        }
//        scanner.close();

//Write a program to find the sum of digits of a given number. (15 sum is 1+5=6)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int originalNumber = scanner.nextInt();
//
//        int sum =0;
//        while(originalNumber !=0){
//            //calculates the last digit of number by taking the remainder when dividing by 10
//            int digit = originalNumber % 10;
//            sum = sum+digit;     //add the current digit to the sum
//            originalNumber = originalNumber/10;  //remove the last digit from number by integer divison
//        }
//        System.out.println("sum of the digits of"+ originalNumber +"is" + sum);

//Write a program to check if a given number is a palindrome.( 121, 1221, 12321)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int originalNumber = scanner.nextInt();
//
//        int reverse = 0;
//        while(originalNumber !=0){
//            int digit = originalNumber %10;  //we find the last digit of the given number by taking remainder when dividing by 10
//            reverse = reverse*10 +digit;   //constructs reversed number digit by  digit, by appending the extracted digit to the right
//            originalNumber = originalNumber/10;  //this line removes the last digit from the original number
//        }               //loop terminates until there are no more digits left in the original number(number is 0)
//        if(originalNumber == reverse) {
//            System.out.println(originalNumber + "is palindrome");
//        } else{
//            System.out.println( originalNumber + "is not palindrome");
//        }
//        scanner.close();

//Write a program to check if a string is a palindrome.(example: "madam")
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String originalString = scanner.nextLine();
//
//        //creates a new "StringBuilder" object with input string "originalString"
//        //then calls reverse() method which reverses the characters of the string
//        //the reversed 'StringBuilder'' object is stored in the variable 'reversedStringBuilder'
//        StringBuilder reversedStringBuilder = new StringBuilder(originalString).reverse();
//
//        //This line converts the reversed StringBuilder object back to a string using the toString() method.
//        //The reversed string is stored in the variable reversedString.
//        String reversedString = reversedStringBuilder.toString();
//
//        boolean isPalindrome = originalString.equals(reversedString);
//
//        if(isPalindrome){
//            System.out.println( originalString + "is a palindrome");
//        } else{
//            System.out.println(originalString+ "is not a palindrome");
//        }

//Write a program to print the reverse of a given string.


////Write a program to swap two numbers without using a temporary variable.
//
//        int a = 5;
//        int b = 10;
//        System.out.print("Before swapping: ");
//        System.out.println("a = " + a + " b = " + b);
//
//        //swapping
//        a = a + b; //add a and b and store the result in a, a holds the sum
//        b = a - b; // b holds the original value of a
//        a = a - b; //a holds the original value of b
//        System.out.print("After swapping: ");
//        System.out.println("a = " + a + " b = " + b);
//
////Write a program to swap two numbers using a temporary variable.
//        int aa = 5;
//        int bb = 10;
//        int temp;
//
//        System.out.print("Before swapping: ");
//        System.out.println("aa = " + aa + " bb = " + bb);
//
//        //swapping
//        temp = aa; //store the value of 'aa' in temp
//        aa = bb; // swap aa and bb
//        bb = temp; //assign temp(which holds a) to b
//
//        System.out.print("After swapping: ");
//        System.out.println("aa = " + aa + " bb = " + bb);

//find the largest numbers among user input.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter first number: ");
//        int n1 = scanner.nextInt();
//
//        System.out.println("enter second number: ");
//        int n2 = scanner.nextInt();
//
//        System.out.println("enter third number: ");
//        int n3 = scanner.nextInt();
//
//        int largest;
//        if(n1 > n2 && n1> n3)
//            largest = n1;
//            else if(n2 > n1 && n2 > n3)
//                    largest = n2;
//            else largest = n3;
//        System.out.println("largest number is: " + largest);
//        scanner.close();
// Write a program to calculate radius of a circle
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter radius: ");
//        double radius= scanner.nextDouble();
//
//        double area = Math.PI*radius * radius;
//        System.out.println("area is: " + area);
//        scanner.close();

//Write a program to check if a number is prime or not.
// prime number: divisible by 1 and itself only.
//
//        //outer loop: iterates over each number from 2 to 10
//        for (int numberToCheck = 2; numberToCheck <= 10; numberToCheck++) {
//
//            boolean isPrime = true;
//            //iterates from 2 to numberToCheck/2, represented by the variable factor.
//            //For each value of factor, it checks if numberToCheck is divisible by factor.
//            for (int factor = 2; factor <= numberToCheck / 2; factor++) {
//                if (numberToCheck % factor == 0) {  //If it's divisible (i.e., numberToCheck % factor == 0),
//                    // it means numberToCheck is not prime, so isPrime is set to false
//                    isPrime = false;
//                }
//            }
//            //if isPrime is true, means numberToCheck is not divisible by any number than 1 and itself
//            if (isPrime) {
//                System.out.println(numberToCheck);
//            }
//        }
//    }

//Write a program to find the factorial of a number.
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter a number: " );
//    int number = scanner.nextInt();
//
//    long factorial = 1;
//        if(number < 0){
//            System.out.println("can not find factorial.");
//        }else if(number <=1){
//            System.out.println("the factorial is 1.");
//        }else{
//            for(int counter = number; counter >=2; counter--){
//                factorial = factorial*counter;
//            }
//        }
//        System.out.println("Factorial of the number is: " + factorial);
//    scanner.close();

//Write a program to find the largest element in an array.

//Write a program to find the second-largest element in an array.
//Write a program to sort an array of integers in ascending order.
//Write a program to implement a basic calculator (addition, subtraction, multiplication, division).
//Write a program to find the sum of digits of a number.
//Write a program to check if a number is Armstrong or not.
//Write a program to find the GCD (Greatest Common Divisor) of two numbers.
//Write a program to check if a year is a leap year.
//Write a program to count the number of vowels and consonants in a string.
//Write a program to find the factorial of a large number using BigInteger.
//        Write a program to check if a number is a perfect number or not.
//        Write a program to find the length of a string without using the length() method.
//        Write a program to find the power of a number using recursion.
//        Write a program to check if a string contains only digits.
//        Write a program to find the sum of all elements in an array.
//        Write a program to reverse an array.
//        Write a program to find the average of elements in an array.
//        Write a program to check if a string is anagram of another string.
//        Write a program to find the maximum occurring character in a string.
//        Write a program to find the nth Fibonacci number.
//        Write a program to check if a string is a valid palindrome ignoring case sensitivity.
//        Write a program to count the occurrences of a specific character in a string.
//        Write a program to find the intersection of two arrays.
//        Write a program to remove duplicates from an array.
//        Write a program to check if a string is a valid identifier.
//        Write a program to check if a number is a strong number or not.
//Write a program to find the largest and smallest elements in an array.
//Write a program to check if a string is a rotation of another string.
//Write a program to count the number of words in a string.
//Write a program to check if a number is a palindrome.
//Write a program to find the sum of all even numbers between 1 to n.
//Write a program to find the number of occurrences of each element in an array.
//Write a program to find the reverse of a number.
//Write a program to generate a random number between 1 to 100.
//Write a program to find the factorial of a number using recursion.
//Write a program to print the elements of an array in reverse order.
//Write a program to find the area of a circle given its radius.
//Write a program to convert Celsius to Fahrenheit.
//Write a program to check if a number is a perfect square.
//Write a program to find the prime factors of a number.
//Write a program to find the sum of natural numbers up to n.
//Write a program to print Floyd's triangle.
//Write a program to check if a string is a valid email address.
//Write a program to find the HCF (Highest Common Factor) of two numbers.

    }
}