package org.example;

// String Methods
public class StringMethods {

    public static void main(String[] args) {
        findYak("yakpak");
    }

    public static void findYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                result = "yak";
                break;
            }
        }
        System.out.println(result);
    }
}
