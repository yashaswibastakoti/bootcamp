package SeleniumTest;

//username/email: yashaswibastakoti@yahoo.com
//password: 123yb123
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class EmailTest {
    WebDriver driver;

    @BeforeClass
    //setup chromeDriver using WebDriver
    public void setup() throws Exception {
        WebDriverManager.chromedriver().setup();
        //Instantiating a ChromeDriver object
        driver = new ChromeDriver();
    }

    //opening yahoo.com and locating and clicking on sign in button
    @Test
    public void PageOpenTest() {
        //open yahoo.com
        driver.get("https://www.yahoo.com/");
        String ActualTitle = driver.getTitle(); //getting the title of the page
        String ExpectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //assert the equality of actual and expected title of the page
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title does not match");

        //Setting implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //locating the sign-in button
        WebElement signInButton = driver.findElement(By.id("login-container"));
        //clicking on the sign-in button
        signInButton.click();

        //Setting implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    //test username and password
    //positive test case (both correct)
    @Test (dependsOnMethods = "PageOpenTest", priority = 1)
    public void PositiveTest() {
        //locating username fields
        WebElement username = driver.findElement(By.id("login-username"));

        //Entering username and clicking enter to go to next page
        username.click();
        username.sendKeys("yashaswibastakoti@yahoo.com");
        username.sendKeys(Keys.ENTER);

        //Setting implicit wait to 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //locating password field
        WebElement password = driver.findElement(By.id("login-passwd"));

        //Entering username and clicking enter to go to next page
        password.click();
        password.sendKeys("123yb123");
        password.sendKeys(Keys.ENTER);

        //Verifying the successful login by checking if user picture is displayed
        WebElement picture = driver.findElement(By.xpath("//*[@id=\"ybarAccountMenuOpener\"]/div[1]/img"));

        //Asserting the user picture is displayed
        Assert.assertTrue(picture.isDisplayed());

        //Setting implicit wait to 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //method to compose and send an email
    @Test(dependsOnMethods = "PageOpenTest", priority = 1)
    public void composeAndSend(){
        //locating mailbox and clicking and opening
        WebElement openMails = driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]"));
        openMails.click();

        //locating compose email button and clicking on it
        WebElement composeNew = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[1]/a"));
        composeNew.click();

        //Typing recipient's email in the email section
        WebElement recipientEmail = driver.findElement(By.xpath("//*[@id=\"message-to-field\"]"));
        recipientEmail.sendKeys("Harsh@collaboraitinc.com");
        recipientEmail.sendKeys(Keys.ENTER);

        //Typing subject in the subject section
        WebElement emailSubject = driver.findElement(By.id("compose-subject-input"));
        emailSubject.sendKeys("QA class Automated Email Test.");
        emailSubject.sendKeys(Keys.ENTER);

        //Typing email body
        WebElement emailBody = driver.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]"));
        emailBody.sendKeys("Hi.\n");
        emailBody.sendKeys("This is an Automated Email sent by using Selenium.\n");

        //locating send button and clicking on it to send the email
        WebElement emailSendButton = driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div[1]/div/div/div[2]/div[2]/div/button"));
        emailSendButton.click();
    }

    @AfterClass
    public void tearDown (){
        if (driver != null){
            //Quitting the WebDriver session
            driver.quit();
        }
    }
}

