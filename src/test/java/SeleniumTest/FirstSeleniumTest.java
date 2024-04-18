package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


/*
1) by ID
2) by name
3) by class name
4) by link text
5) by partial link test
6) by tag name
7) by css selector


8) Relative X-Path
8.1) Absolute X-Path

 */
public class FirstSeleniumTest {

    //declaring WebDriver instance
    WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup(); //setting up ChromeDriver using WebDriverManager
        driver = new ChromeDriver(); //Instantiating a ChromeDriver object
    }

    @Test
    public void FirstTest() {
        driver.get("https://www.google.com"); // opening google.com website
        String ActualTitle = driver.getTitle(); //getting the title of the page
        String ExpectedTitle = "Google";

        //Asserting the equality of actual and expected titles
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title not match");
    }

    @Test (dependsOnMethods = "FirstTest") //Second case depends on FirstTest
    public void SecondTest() {
        driver.findElement(By.name("q")).click(); //searching for the text box on Google and clicking on it to start typing
        driver.findElement(By.name("q")).sendKeys("selenium tutorial for beginners"); //typing the text in the Google search box
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  //pressing enter key on keyboard

        //getting the title of the page to check what we searched
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "selenium tutorial for beginners - Google Search";

        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title not match"); //asserting the search
    }

    @Test (dependsOnMethods = "SecondTest") //ThirdTest depends on SecondTest
    public void ThirdTest() {
        //clicking on a search result link
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[5]/div/div/div[1]/div/div/span/a")).click();

        //Setting implicit wait to 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Getting the company name from the page
        String companyName = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/p/a")).getText();
        String Expected = "ArtOfTesting";

        Assert.assertEquals(companyName, Expected, "company name not match");

        //navigating back to the search results page
        driver.navigate().back();
        driver.navigate().back();
    }

    @AfterClass
    public void tearDown () throws Exception {
        if (driver != null) {
            //closing th browser window
  //         driver.close();
            //Quitting the WebDriver session
            driver.quit();
            }
        }
    }





