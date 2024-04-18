package JavaCollection;

import java.util.Stack;

public class JavaStackExample {

    public static void main(String[] args){

    String original = "CiviC";
    String reversed = reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

