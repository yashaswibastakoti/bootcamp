package JDBC_PostgreSQL;

import java.sql.SQLException;

public class MethodCalls {
    public static void main(String[] args) throws SQLException {

        //Create
       //DATA_CALLS.create("Mark", "MC Dona", "123-456-7889","mark@gmail.com");

        //Read
       String Student = DATA_CALLS.Read();
       System.out.println(Student);

        //Update
      // DATA_CALLS.update("Dona","MC KING", 6);

        //Delete
       // DATA_CALLS.delete(7);

    }
}