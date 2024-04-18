package org.example;

//given an int n, return true if it is within 10 of 100 or 200
//meaning 90-110 , 190-210

public class Challenge {
    public static void main(String[] args){
    System.out.println(isWithin100(195));
    }

    public static boolean isWithin100(int n) {
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210){
            return true;
        }
        return false;
    }
}
