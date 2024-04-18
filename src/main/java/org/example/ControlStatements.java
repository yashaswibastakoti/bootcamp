package org.example;
import java.util.Random;

public class ControlStatements {

    public static void main(String[] args) {
        dice();
    }

    public static void dice() {
        Random random = new Random();
        int diceValue;
        do {
            diceValue = random.nextInt(6) + 1;
            System.out.println("value of dice:  " + diceValue);

        } while (diceValue != 6);
    }
}