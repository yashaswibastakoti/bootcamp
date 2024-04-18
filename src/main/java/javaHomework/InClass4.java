package javaHomework;

import java.util.Scanner;

public class InClass4{

public static void main(String[] args){

    System.out.println(EveryOther("Heeololeo"));

    int[] arr= {1,1,2,3,1};

    System.out.println(Array123(arr));

    System.out.println(StringSplosion("Code"));

    System.out.println(seeColor("bluexxxred"));

    System.out.println(endsLy("lily"));

    System.out.println(firstHalf("hello world"));

    int[] a= {1,2,3,4,5,6};
    int[] b = {1,2,3,4,5,6};

    System.out.println(start1(a,b));
    System.out.println(commonEnd(a,b));

}
     public static int Addition(int num1, int num2) {
          return num1 + num2;
      }

    // given a string, return a new string made of every other char starting with the first,
//so "Hello" yields "Hlo"
//stringBits("Hello") -> "Hlo
//stringBits("Hi") -> "H"
//stringBits(Heeololeo") -> "Hello"
public static String EveryOther(String str){
    String result= "";
    for(int i=0; i < str.length(); i+=2){
        result = result + str.substring(i,i+1);
    }
    return result;
}

        //Given an array of ints, return true f the sequence of numbers 1,2,3 appears in the array somewhere.
//array123([1,2,3,1]) -> true
//array123([1,1,4,1]) -> false
//array123([1,2,1,2,3,]) -> true
        public static boolean Array123(int[] arr) {
            for (int i = 0; i < (arr.length - 2); i++) {
                if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3);
                   return true;
                }
                return false;
        }

        // Given a non-empty string like "Code" return a string like "CCoCodCode".
//stringSplosion("Code") -> "CCoCodCode"
//stringSplosion("abc") -> "aababc"
//stringSplosion("ab") -> "aab"

        public static String StringSplosion (String str){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result = result + str.substring(0,i+1);
            }
            return result;
        }
    // Given a string, return true if it ends in "ly"
    //endsLy("oddly") -> true;
    //endsLy("y") -> false;
    //endsLy("oddy") -> false;
    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    //Given a string, if the string begins with "red" or "blue" return that color string,
    // otherwise return the empty string.
    //seeColor("redxx") -> "red"
    //seeColor("xxred") -> ""
    //seeColor("blueTimes") -> "blue"
    public static String seeColor(String str){
        if(str.startsWith("red"))
        return "red";
       else if(str.startsWith("blue"))
           return "blue";
        else return "";
    }

    // Given a string of even length, return the first half, so the string "WooHoo" yields "Woo".
    //firstHalf("WooHoo") -> "Woo"
    //firstHalf("HelloThere") -> "Hello"
    //firstHalf("abcdef") -> "abc"
    public static String firstHalf(String str){
        return str.substring(0, str.length()/2);
    }

    //Given 2 arrays of ints, a and b, return true if they have the same first elements,
    // or they have the same last elements.
    //both arrays will be length 1 or more
    //commonEnd([1,2,3], [7,3]) -> true
    //commonEnd([1,2,3],[7,3,2]) -> false
    //commonEnd([1,2,3],[1,3])-> true

    public static boolean commonEnd(int [] a, int [] b){
        if(a.length < 1 || b.length < 1)
            return false;
        return a[0] == b[0] || a[a.length -1] == b[b.length -1];
    }

    //Start with 2 int arrays, a and b, of any length, return how many of the arrays have 1 as their first element.
    //start1([1,2,3],[1,3]) -> 2
    //start1([7,2,3],[1]) -> 1
    //start1([1,2],[]) -> 1

    public static int start1(int[] a, int[] b) {
        int count= 0;
        if(a.length > 0 && a[0] ==1) {
            count++;
        } if(b.length >0 && b[0] ==1){
            count++;
        } return count;
    }

// given a string name, e.g, "Bob", return a greeting of the form "Hello Bob!"
    //helloName("Bob") -> "Hello Bob!"
    //helloName("Alice") -> "Hello"
    //helloName("X") -> "Hello X!"
        public static String helloName(String str){
        return "Hello " + str + "!";
        }
    }



