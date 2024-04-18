package JavaIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFileInput {
    public static void main(String[] args) {
        read();
    }

    public static void read() {
        String WindowsPath = "c:/Users/12409/Desktop/myFile.txt";
        try {
            FileReader fileReader = new FileReader(WindowsPath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File read error " + e.getMessage());
        }
    }
}

class JavaFileOutput {
    public static void main(String[] args) {

        write();
    }
    public static void write() {
        String WindowsPath = "c:/Users/12409/Desktop/myFile.txt";

        try {
            FileWriter fileWriter = new FileWriter(WindowsPath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //write content to file
            bufferedWriter.write("this is text in the file we created. \n");
            bufferedWriter.write("It contains some simple text. \n");
            bufferedWriter.close();

            System.out.println("File " + WindowsPath + "has been created successfully");

        } catch (IOException e) {
            System.out.println("An error occurred- " + e.getMessage());
        }
    }
}

