package JavaCollection;
/*
import java.sql.SQLOutput;
import java.util.Vector;
import java.util.Scanner;

public class javaVectorExample {
    public static void main(String[] args){

    VectorExample();
    }

    public static void VectorExample() {
        Vector<Integer> vector = new Vector<Integer>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("vector size: "+ vector.size());
        System.out.println("Capacity vectors: "+ vector.capacity());
        System.out.println("vector Index: "+ vector.get(0));

        System.out.println("Vector elements: ");
        for(Integer element: vector){
            System.out.println(element);
        }
        vector.remove(2);

        System.out.println("New Vector elements: ");
        for(Integer element: vector){
           System.out.println(element);
         }
    }
}

class TODOItem{
    private String task;
    private boolean completed;

    public TODOItem(String task, boolean completed){
        this.task =task;
        this.completed = completed;
    }
    public String getTask(){
        return task;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void MarkAsCompleted(){
        this.completed = true;
    }
    @Override
    public String toString(){
        return (completed ? "[X]" + task : "[ ]"+ task);
    }
}

class TODOList{
    private Vector<TODOItem> items;

    public TODOList(){
        items = new Vector<>();
    }
    public void addItem(String task){
        TODOItem newItem = new TODOItem(task);
        items.add(newItem);
    }
    public void MarkAsCompleted(int index){
        if(index >= 0 && index < items.size()){
            items.get(index).MarkAsCompleted();
        } else{
            System.out.println("Invalid index");
        }
    }

    public void synchronizedRemove(int index){
        synchronized (items){
            if(index >= 0 && index < items.size()){
                items.remove(index);
            } else{
                System.out.println("Invalid index");
            }
        }
    }
    public void displayList(){
        if(items.isEmpty()){
            System.out.println("TODO List is empty");
        } else{
            System.out.println("TODO List: ");
            for(int i = 0; i < items.size(); i++){
                System.out.println((i+ 1)+ " . "+ items.get(i));
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TODOList todoList = new TODOList();

        System.out.println("MY LIST");

        while(true){

            System.out.println("\nChoose an option:  ");
            System.out.println("1. Add an item ");
            System.out.println("2. Mark as completed");
            System.out.println("3. Remove an item ");
            System.out.println(" 4. Display the list");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    System.out.println("Enter the task to add: ");
                    String task = scanner.nextLine();
                    todolist.addItems(task);
                    break;
                    case 2:
                        System.out.println("Enter the index of the item to mark as complete: ");
                        int index = scanner.nextInt();
                        todolist.MarkAsCompeleted(index-1);
                        break;
                case 2:
                    System.out.println("Enter the index of the item to mark as complete: ");
                    int index = scanner.nextInt();
                    todolist.MarkAsCompeleted(index-1);
                    break;
                case 3:
                    System.out.println("Enter the index of the item to mark as complete: ");
                    int index = scanner.nextInt();
                    todolist.MarkAsCompeleted(index-1);
                    break;
                case 4:
                    System.out.println("Enter the index of the item to mark as complete: ");
                    int index = scanner.nextInt();
                    todolist.MarkAsCompeleted(index-1);
                    break;
                case 5:
                    System.out.println("Enter the index of the item to mark as complete: ");
                    int index = scanner.nextInt();
                    todolist.MarkAsCompeleted(index-1);
                    break;
                default:
                    System.out.println("Invalid options");
                    break;
            }
        }
    }
}
*/