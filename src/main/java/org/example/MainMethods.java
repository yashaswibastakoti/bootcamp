package org.example;

public class MainMethods {
    public static void main(String[] args) {

        double x = 19.012;
        double y = 19.95;

        // Math.max example
        //Returns the greater of two double values
        double maxXY = Math.max(x, y);
        System.out.println("Maximum value: " + maxXY);
        // Output: Maximum value: 19.95

        // Math.min example
        // Returns the smaller of two double values
        double minXY = Math.min(x, y);
        System.out.println("Minimum value: " + minXY);
        // Output: Minimum value: 19.012

        // Math.abs example
        //Returns the absolute value
        double absDiff = Math.abs(x - y);
        System.out.println("Absolute difference: " + absDiff);
        // Output: Absolute difference: 0.9380000000000027

        // Math.sqrt example
        // Returns the square root
        double sqrtX = Math.sqrt(x);
        System.out.println("Square root of x: " + sqrtX);
        // Output: Square root of x: 4.364448492751568

        // Math.floor example
        // Returns the largest (closest to positive infinity) double value
        // that is less than or equal to the argument.
        double floorX = Math.floor(x);
        System.out.println("Floor value of x: " + floorX);
        // Output: Floor value of x: 19.0

        // Math.ceil example
        //Returns the smallest (closest to negative infinity) double value
        // that is greater than or equal to the argument.
        double ceilY = Math.ceil(y);
        System.out.println("Ceil value of y: " + ceilY);
        // Output: Ceil value of y: 20.0

        // Math.pow example
        // Returns the value of the first argument raised to the power of the second argument.
        double powResult = Math.pow(x, 2);
        System.out.println("x raised to the power of 2: " + powResult);
        // Output: x raised to the power of 2: 361.144144

        // Math.random example
        //Returns a double value with a positive sign,
        // greater than or equal to 0.0 and less than 1.0.
        double randomValue = Math.random();
        System.out.println("Random value: " + randomValue);
        // Output: Random value: 0.2612287478283079

        // Math.round example
        // Returns the closest long to the argument.
        long roundedY = Math.round(y);
        System.out.println("Rounded value of y: " + roundedY);
        // Output: Rounded value of y: 20
    }

}