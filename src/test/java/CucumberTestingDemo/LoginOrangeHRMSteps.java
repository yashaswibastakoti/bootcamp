package CucumberTestingDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class LoginOrangeHRMSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I am on the OrangeHRM login page")
    public void i_am_on_the_OrangeHRM_login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I enter username {string} and {string}")
    public void i_enter_username_and(String username, String password){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement usernameField =
                driver.findElement(By.name("username"));
        WebElement passwordField =
                driver.findElement(By.name("password"));

        WebElement loginButton =
                driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @Then("I should be {string}")
    public void i_should_be(String outcome){
        if(outcome.equalsIgnoreCase("logged in")){
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        }else{
            WebElement InvalidCredField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));

            String ActualRequiredField = InvalidCredField.getText();
            String ExpectedRequiredField = "Invalid credentials";

            //Asserting
            Assert.assertEquals(ActualRequiredField, ExpectedRequiredField, "Required not found");
        }
        driver.quit();
    }
}
