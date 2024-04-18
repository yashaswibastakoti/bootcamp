package JDBC_PostgreSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DATA_CALLS {
    public static void create(int id, String FirstName, String LastName, String Phone, String Email) throws SQLException {

        try (Connection connection = JDBC_CONNECTION.getConnection()) {
            assert connection != null;
            String query = "INSERT INTO myClass(id, FirstName, LastName, Phone,Email) VALUES(?,?,?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                //statement.setString(1, String.valueOf(id));
                statement.setString(2, FirstName);
                statement.setString(3, LastName);
              //  statement.setString(4, Phone);
               // statement.setString(5, Email);
                statement.executeUpdate();
                System.out.println("Data inserted successfully.");

            } catch (SQLException e) {
                System.err.println("Error occurred while inserting data. ");
                e.printStackTrace();
            }
        }
    }
        public static String Read(){

            StringBuilder result = new StringBuilder();
            try (Connection connection = JDBC_CONNECTION.getConnection()) {
                assert connection != null;
                try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM myClass")) {
                    ResultSet resultSet = statement.executeQuery();

                    while (resultSet.next()) {
                        result.append(resultSet.getString("id")).append(" ")
                                .append(resultSet.getString("FirstName")).append(" ")
                                .append(resultSet.getString("LastName")).append(" ")
                                .append(resultSet.getString("Phone")).append(" ")
                                .append(resultSet.getString("Email")).append("\n");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error occurred while executing query: " + e.getMessage());
            }
            return result.toString();
        }

    public static void update(String newFirstName, String newLastName, int Id) {
        try (Connection connection = JDBC_CONNECTION.getConnection()){
            assert connection !=null;
            try(PreparedStatement statement = connection.prepareStatement("UPDATE myClass SET FirstName = ?, LastName = ? WHERE id = ?")){
                statement.setString(1, newFirstName);
                statement.setString(2,newLastName);
                statement.setInt(3, Id);
                int rowsUpdated = statement.executeUpdate();

                if(rowsUpdated > 0){
                    System.out.println("Data updated successfully");
                }else{
                    System.out.println("No data found to update.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error occurred while updating data.");
        e.printStackTrace();
        }
    }

    public static void delete(int Id){
        try (Connection connection = JDBC_CONNECTION.getConnection()){
            assert connection !=null;
            try(PreparedStatement statement = connection.prepareStatement("DELETE FROM myClass WHERE id= ?")){
                statement.setInt(1,Id);
                int rowsDeleted = statement.executeUpdate();
                if(rowsDeleted > 0){
                    System.out.println("Data deleted successfully.");
                }else{
                    System.out.println("No data found to delete.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error occurred while deleting data.");
             e.printStackTrace();
        }
    }
}
