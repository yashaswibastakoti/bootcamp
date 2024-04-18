package JavaCollection;
/*
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        ArrayListExample();
    }
    public static void ArrayListExample() {

        ArrayList<String> AL = new ArrayList<String>();

        AL.add("Java");
        AL.add("Python");
        AL.add("C++");
        AL.add("Ruby");
        AL.add("PHP");
        AL.add("C#");

        int size = AL.size();
        System.out.println(size);

        boolean contain = AL.contains("Java");
        System.out.println(contain);

        AL.remove("Java");
        System.out.println(AL);

        System.out.println(AL.get(0));  //get the first element
        System.out.println(AL.get(1));  //get the second element

        System.out.println(AL.indexOf("Python"));  //get index of the element

        //initialization interface of Iterator interface
        Iterator itr = AL.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next()); //running while loop and iteration over the array will give us each element
        }
        System.out.println(AL);  //Original it is a String Array
    }
}


  write a java program that utilizes an ArrayList to manage the student roster.
  Implement methods to perform the following operations:
  Remove a student from the roster, by their student ID.
  Search for a student by their name and return their information(student ID, name, etc.).
  Update the information of an existing student (e.g., change their name or other attributes).
  Display the entire roster of students.


class Student {
    ArrayList<String> AL = new ArrayList<String>();

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID: " + id + " , Name: " + name;
    }
}
class StudentRoster {
    private ArrayList<Student> roster;

    public StudentRoster() {
        roster = new ArrayList<>();
    }

    public void addStudent(int id, String name) {
        roster.add(new Student(id, name));
    }
    public void removeStudent(int id) {
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).getId() == id) {
                roster.remove(i);
                System.out.println("Student " + id + "has been removed from the roster.");
                return;
            }
        }
        System.out.println("Student with ID: " + id + "not found.");
    }

    public Student searchStudentByName(String name) {
        for (Student student: roster) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    public void updateStudent(int id, String NewName){
        for(Student student: roster){
            if(student.getId() == id){
                student.setName(NewName):

            }
        }
    }
    public void displayRoster () {
        if (roster.isEmpty()) {
            System.out.println("roster empty.");
            return;
        }
        System.out.println("Student roster:  ");
        for (Student student : roster) {
            System.out.println(student);
        }
    }
}

class main {
    public static void main(String[] args) {
        StudentRoster roster = new StudentRoster();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1.Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search a student");
            System.out.println("4.Update the current student");
            System.out.println("5.Display roster");
            System.out.println("6. Exit ");

        }
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter student id and name: ");
                int id = scanner.nextInt();
                String name = scanner.nextLine();
                roster.addStudent(id, name);
                break;
            case 2:
                System.out.println("Enter student id to remove: ");
                int RemoveId = scanner.nextInt();
                roster.removeStudent(RemoveId);
                break;
            case 3:
                System.out.println("Enter student name to search: ");
                String SearchName = scanner.nextInt();
                Student student = roster.searchStudentByName(SearchName);
                if (searchedStudent != null) {
                    System.out.println("Student found: " + searchedStudent);
                } else {
                    System.out.println("Student not found.");
                }
                break;
            case 4:
                System.out.println("Enter student id");
                int updateId = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter new name");
                String newName = scanner.nextLine();
                roster.updateStudent(updateId, newName);
                break;
            case 5:
                roster.displayRoster();
                break;
            case 6:
                System.out.println("exiting Application..");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose again.");

        }
    }
}
*/
