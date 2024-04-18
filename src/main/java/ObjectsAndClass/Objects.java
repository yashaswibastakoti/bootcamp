package ObjectsAndClass;

public class Objects {
 int id;

 String name;

 String description;

 public Objects(int id, String name, String description){
     this.id = id;
     this.name = name;
     this.description = description;

 }

 public void add(){
     System.out.println("this is doing something...");

 }
 public void printAll(){
     System.out.println(id + ":" + name + ": " + description);

 }
 public static void main(String[] args){
    //creating object
     Objects obj = new Objects(1, "abc", "this is an example");
     Objects obj2 = new Objects(2,"def", "this is next example");
     obj.printAll();
     obj2.printAll();
     obj.add();

 }
}

//for homework, create a class and create objects
//create a class called company
//where it has model number, model name, number of wheels, it can start, it can stop

