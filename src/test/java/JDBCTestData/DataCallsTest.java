package JDBCTestData;

import JDBC_PostgreSQL.DATA_CALLS;
import JavaIO.JavaIOExcelFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataCallsTest {

    @Test
    public void getDataTest() throws Exception{
        String ActualData = DATA_CALLS.Read();
        String ExpectedData = JavaIOExcelFile.readFile();

        //print actual and expected data for debugging
        System.out.println("Actual data: "+ ActualData);
        System.out.println("Expected data: " + ExpectedData);

        Assert.assertEquals(ActualData, ExpectedData.trim(), "Data returned does not match");
    }
}
