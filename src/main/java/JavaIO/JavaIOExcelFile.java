package JavaIO;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class JavaIOExcelFile {
    public static void main(String[] args) throws IOException {
        //writeFile();
        readFile();
    }

    public static String readFile() throws IOException {
        String path = "c:/Users/12409/Desktop/StudentData.xlsx";
        StringBuilder rowData = new StringBuilder();

        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fileInputStream);

        Sheet sheet = wb.getSheetAt(0);

        for (Row row : sheet) {
            StringBuilder rowString = new StringBuilder();

            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        rowString.append(cell.getStringCellValue());
                        break;
                    default:
                        rowString.append(",");
                }
                rowString.append(" "); //Append space after each cell
            }
            //Remove the trailing space added after the last cell value of each row
            if (!rowString.isEmpty()) {
                rowString.deleteCharAt(rowString.length() - 1);
            }
            rowData.append(rowString).append("\n");
        }
            wb.close();
            fileInputStream.close();
            return rowData.toString();
        }
    public static void writeFile() {

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Student Data");

        String[] columnNames = {"Name", "Email","Phone"};

        Object[][] data = {
                {"John doe", "John@example.com", "111-222-3333"},
                {"Mary doe", "John@example.com", "444-555-6666"},
                {"Jane doe", "John@example.com", "111-222-5555"},
                {"Mark doe", "John@example.com", "444-888-3333"},
                {"Jason doe", "John@example.com", "555-222-7777"},
        };

        Row headerRow = sheet.createRow(1);
        for(int i = 0; i < columnNames.length;i++){
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columnNames[i]);
        }

        int rowNum = 2;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int column = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(column++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        String path ="c:/Users/12409/Desktop/StudentData.xlsx";
        try (FileOutputStream outputStream = new FileOutputStream(path )){
            wb.write(outputStream);
            System.out.println("Excel File created successfully");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
