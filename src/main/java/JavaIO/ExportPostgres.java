package JavaIO;
/*
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportPostgres {
    public static void exportPostgresData(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/2024ClassPractice";
        String username = "postgres";
        String password = "170940";
        String sqlQuery = " SELECT * FROM myClass";

        try(Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery()){
            try(XSSFWorkbook workbook = new XSSFWorkbook()){
                //create a new sheet
                var sheet = workbook.createSheet("ExportedData");

                //Iterate through the result set and write data to Excel sheet

            }

        }
    }
    String Path =.....;
    StringBuilder rowData = new StringBuilder();

    FileInputStream fileInputStream = new FileInputStream(path);
    Workbook wb = new XSSFWorkbook(fileInputStream);

    Sheet sheet = wb.getSheetArt(0);
    for(Row row: sheet){
        StringBuilder rowString = new StringBuilder();

        for(Cell cell: row){
            switch(cell.getCellType()){
                case STRING:
                    rowString.append(cell.getStringCellValue());
                    break;
                default:
                    rowString.append(",");
            }
            rowString.append(" "); //Append space after each cell value
            if(!rowString.isEmpty()){
                rowString.deleteCharAt(rowString.length()-1);
            }
            rowData
        }

        //Remove the trailing space added after the last cell value of each row
    }
}
*/