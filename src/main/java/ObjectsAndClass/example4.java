package ObjectsAndClass;

public class example4 {
    //attributes
    int id;
    String name;

    example4(int i, String s) {
        id = i;
        name = s;
    }
    void display() {
        System.out.println(id+ " " + name);
    }
}

class Employee{
    public static void main(String[] args){
        example4 e1= new example4(10,"john");
        example4 e2= new example4(20,"mary");

        e1.display();
        e2.display();

    }
}

