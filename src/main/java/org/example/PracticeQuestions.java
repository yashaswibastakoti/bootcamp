package org.example;

public class PracticeQuestions {
    public static void main(String[] args) {

        //1)
        stringBits("Hello");
        stringBits("Hi");
        stringBits("Heeololeo");

        System.out.println();
        //2)
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 1, 4, 1};
        int[] arr3 = {1, 2, 1, 2, 3};

        System.out.println(array123(arr1));
        System.out.println(array123(arr2));
        System.out.println(array123(arr3));

        System.out.println();
        //3)
        stringSplosion("Code");
        stringSplosion("abc");
        stringSplosion("ab");

        System.out.println();
        //4)
        GreetingName("Bob");
        GreetingName("Alice");
        GreetingName("X");

        System.out.println();
        //5
        firstHalf("WooHoo");
        firstHalf("HelloThere");
        firstHalf("abcdef");

        System.out.println();
        //6
        endsLy("oddly");
        endsLy("y");
        endsLy("oddy");

        System.out.println();
        //7
        seeColor("redxx");
        seeColor("xxred");
        seeColor("blueTimes");
    }

    //1) given a string, return a new string made of every other char starting with the first,
//so "Hello" yields "Hlo"
//stringBits("Hello") -> "Hlo
//stringBits("Hi") -> "H"
//stringBits(Heeololeo") -> "Hello"
    public static String stringBits(String str) {
        String result = " ";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

        //2)Given an array of ints, return true f the sequence of numbers 1,2,3 appears in the array somewhere.
//array123([1,2,3,1]) -> true
//array123([1,1,4,1]) -> false
//array123([1,2,1,2,3,]) -> true
        public static boolean array123 (int[] arr) {
            for (int i = 0; i < (arr.length - 2); i++) {
                if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3);
                   return true;
                }
                return false;

        }

        //3) Given a non-empty string like "Code" return a string like "CCoCodCode".
//stringSplosion("Code") -> "CCoCodCode"
//stringSplosion("abc") -> "aababc"
//stringSplosion("ab") -> "aab"

        public static String stringSplosion (String str){
            String result = " ";
            for (int i = 0; i < str.length(); i++) {
                result = result + str.substring(0,i+1);
            }
            return result;
        }
        //4) given a string name, e.g, "Bob", return a greeting of the form "Hello Bob!"
    //helloName("Bob") -> "Hello Bob!"
    //helloName("Alice") -> "Hello"
    //helloName("X") -> "Hello X!"
        public static void GreetingName(String name){
            String greeting = "Hello " + name + "!";
            System.out.println(greeting);
        }

    //5) Given a string of even length, return the first half, so the string "WooHoo" yields "Woo".
    //firstHalf("WooHoo") -> "Woo"
    //firstHalf("HelloThere") -> "Hello"
    //firstHalf("abcdef") -> "abc"
        public static void firstHalf(String str){
        int halfLength = str.length()/2;
            System.out.println(str.substring(0, halfLength));
        }

    //6) Given a string, return true if it ends in "ly"
    //endsLy("oddly") -> true;
    //endsLy("y") -> false;
    //endsLy("oddy") -> false;
    public static void endsLy(String str){
        boolean endsInLy = str.endsWith("ly");
        System.out.println(endsInLy);
    }

    //7) Given a string, if the string begins with "red" or "blue" return that color string,
    // otherwise return the empty string.
    //seeColor("redxx") -> "red"
    //seeColor("xxred") -> ""
    //seeColor("blueTimes") -> "blue"
    public static void seeColor(String str){
        if(str.startsWith("red")){
            System.out.println("red");
        }else if (str.startsWith("blue")){
            System.out.println("blue");
        }else{
            System.out.println(" ");
        }
    }

    //Given 2 arrats of ints, a and b, return true if they have the same first elements
    // or they have the same last elements.
    //both arrays will be length 1 or more
    //commonEnd([1,2,3], [7,3]) -> true
    //commonEnd([1,2,3],[7,3,2]) -> false
    //commonEnd([1,2,3],[1,3])-> true


    //Start with 2 int arrays, a and b, of any length, return how many of the arrays have 1 as their first element.
    //start1([1,2,3],[1,3]) -> 2
    //start1([7,2,3],[1]) -> 1
    //start1([1,2],[]) -> 1

}





