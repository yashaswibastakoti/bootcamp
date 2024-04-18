//package CucumberTestingDemo;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
////username/email: yashaswibastakoti@yahoo.com
////password: 123yb123
//public class YahooEmail{
//    private WebDriver driver;
//
//    @Given("I am on the google search page")
//    public void i_am_on_the_google_search_page() {
//
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//    }
//
//    @When("I search for {string}")
//    public void i_search_for(String searchTerm) {
//        WebElement searchString = driver.findElement(By.name("q"));
//
//        searchString.sendKeys(searchTerm);
//        searchString.sendKeys(Keys.ENTER);
//    }
//
//    @When("I click on the Yahoo link")
//    public void i_click_on_yahoo_link() throws InterruptedException {
//        Thread.sleep(2000);
//
//        driver.findElements(By.cssSelector("h3")).stream().filter(webElement -> webElement.getText().contains("Yahoo"))
//                .findFirst()
//                .ifPresent(webElement -> webElement.findElement(By.xpath("..")).click());
//    }
//    @When("I signin using valid credentials")
//    public void i_signin_using_valid_credentials() throws InterruptedException{
//
//        //locating and clicking on the sign-in button
//        WebElement signInButton = driver.findElement(By.id("login-container"));
//        signInButton.click();
//
//        //locating and entering keys in the username fields
//        WebElement username = driver.findElement(By.id("login-username"));
//        username.click();
//        username.sendKeys("yashaswibastakoti@yahoo.com");
//        username.sendKeys(Keys.ENTER);
//
//        Thread.sleep(2000);
//
//        //locating and entering keys in the password field
//        WebElement password = driver.findElement(By.id("login-passwd"));
//        password.click();
//        password.sendKeys("123yb123");
//        password.sendKeys(Keys.ENTER);
//
//        //Verifying the successful login by checking if user picture is displayed
//        WebElement picture = driver.findElement(By.xpath("//*[@id=\"ybarAccountMenuOpener\"]/div[1]/img"));
//
//        //Asserting the user picture is displayed
//        Assert.assertTrue(picture.isDisplayed());
//    }
//
//    @When("I open inbox")
//    public void i_open_inbox() throws InterruptedException {
//
//        //locating mailbox and clicking and opening
//        WebElement openMails = driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]"));
//        openMails.click();
//
//        //locating compose email button and clicking on it
//        WebElement composeNew = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[1]/a"));
//        composeNew.click();
//    }
//
//    @Then("I should be taken to my Yahoo inbox")
//    public void i_should_be_taken_to_my_yahoo_inbox() {
//
//        String ActualTitle = driver.getTitle(); //getting the title of the page
//        String ExpectedTitle = "(No new emails) - yashaswibastakoti@yahoo.com - Yahoo Mail";
//
//        //Asserting the equality of actual and expected titles
//        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title does not match");
//
//        driver.quit();
//    }
//}
