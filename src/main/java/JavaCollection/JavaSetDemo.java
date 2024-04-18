package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class JavaSetDemo {
    public static void main(String[] args){
    Set<String> names = new HashSet<>();

    names.add("John");
    names.add("Mary");
    names.add("John");
    names.add("Charlie");
    names.add("Mona");

        System.out.println("Set elements: "+ names);

        names.remove("John");
        System.out.println("Set elements: "+ names);
        System.out.println("Is Mona present?" + names.contains("Mona"));

        System.out.println("set size: "+ names.size());

        names.clear();
        System.out.println("set is empty?" + names.isEmpty());
    }
}
