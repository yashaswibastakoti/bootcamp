package JavaOOP;

//Aggregation
public class Aggregation {

    public static void main(String[] args){

    Book book1 = new Book( "The Great Gatsby", "F.Scott Fitzgerald");
    Book book2 = new Book ("1984", "George Orwell");
    Book book3 = new Book ("632", "eg yhtrgf");

    Library library = new Library( "City library", 3);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    library.displayBooks();
    }
}

class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}
class Library{
    private String name;
    private Book[] books;
    private int noOfBooks;

    public Library(String name, int capacity){
        this.name = name;
        this.books = new Book[capacity];
        this.noOfBooks = 0;
    }
    public void addBook(Book book){
        if(noOfBooks < books.length){
            books[noOfBooks] = book;
            noOfBooks++;
        } else{
            System.out.println("lib is full");
        }
    }
    public void displayBooks() {
        System.out.println("Books in " + name + " : ");
        for (int i = 0; i < noOfBooks; i++) {
            System.out.println("Title: " + " " + books[i].getTitle() + "  " + "Author: " + books[i].getAuthor());
        }
    }
}