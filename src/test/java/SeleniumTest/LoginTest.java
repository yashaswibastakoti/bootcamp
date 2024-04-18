package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {

    //Declaring WebDriver instance
    WebDriver driver;

    //The setup method is annotated with @BeforeMethod and
    // accepts a parameter named 'browser', which specifies the browser
    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){
        switch(browser.toLowerCase()){   //setting up the WebDriver based on the specified browser parameter
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                System.out.println("No browser found");
                break;
        }

        //opening the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //test to open the login page
    @Test
    public void login(){

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "OrangeHRM";

        //asserting the title of the page
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title does not match");
    }


    //Positive test case for successful login
    @Test(dependsOnMethods = "login", priority = 1)
    public void positiveTest() {

        //locating username and password fields
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        //Entering credentials and submitting the form
        username.click();
        username.sendKeys("Admin");
        password.click();
        password.sendKeys("admin123");
        password.sendKeys(Keys.ENTER);

        //Verifying the successful login by checking if user picture is displayed
        WebElement picture = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"));

        //Asserting the user picture is displayed
        Assert.assertTrue(picture.isDisplayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //negative test case for login with empty username
    @Test(dependsOnMethods = "login", priority = 2)
    public void negativeTest1(){

        //locating username and password fields
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        //Entering empty username and valid password
        username.click();
        username.sendKeys("");

        password.click();
        password.sendKeys("admin123");

        password.sendKeys(Keys.ENTER);

        //verifying error message for empty username
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));

        String ActualString = message.getText();
        String ExpectedString = "Required";

        //Asserting
        Assert.assertEquals(ActualString, ExpectedString, "does not match");
    }

    //navigate test case for login with empty password
    @Test(dependsOnMethods = "login", priority = 2)
    public void negativeTest2(){

        //locating username and password fields
        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        //Entering valid username and password fields
        username.click();
        username.sendKeys("Admin");

        password.click();
        password.sendKeys("");

        password.sendKeys(Keys.ENTER);

        //verifying error message for empty password
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span"));

        String ActualString = message.getText();
        String ExpectedString = "Required";

        //Asserting
        Assert.assertEquals(ActualString, ExpectedString, "does not match");
    }

    // Negative test case for login with invalid credentials
    @Test(dependsOnMethods = "login", priority = 3)
    public void negativeTest3(){

        // Locating username and password fields
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));

        // Entering invalid username and valid password
        username.click();
        username.sendKeys("aaaa");

        password.click();
        password.sendKeys("admin123");

        password.sendKeys(Keys.ENTER);

        // Verifying error message for invalid credentials
        WebElement message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));

        String ActualString = message.getText();
        String ExpectedString = "Invalid credentials";

        //Asserting
        Assert.assertEquals(ActualString, ExpectedString, "does not match");
    }

    // Tear down method to close the browser
   @AfterMethod
    public void tearDown(){
        //close the browser
        driver.quit();
    }
}
