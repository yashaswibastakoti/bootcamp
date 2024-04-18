package SeleniumTest;

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
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondSeleniumTest {

    //declaring WebDriver instance
    WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();  //Setting up ChromeDriver using WebDriverManager
        driver = new ChromeDriver();  //Instantiating a ChromeDriver object
    }

    ///for homework
//write a script that will take you to amazon.com and search for socks/any other products
// and count the products that are available on the first page and assert that.

    @Test
    public void FirstTest() {
        // opening amazon.com website
        driver.get("https://www.amazon.com");

        //getting the title of the page
        String ActualTitle = driver.getTitle();

        String ExpectedTitle = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title not match");
    }

    //test case to search for socks on Amazon
    @Test (dependsOnMethods = "FirstTest")
    public void SecondTest() {

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("socks");

        //submit the search
        searchBox.submit();

        //getting the title of the page to check what we searched
        String SockSearch = driver.getTitle();
        String SocksSearchResult = "Amazon.com : socks";

        Assert.assertEquals(SockSearch, SocksSearchResult, "result not match"); //asserting the search
    }

    //test case to count and analyze search results
    @Test (dependsOnMethods = "SecondTest")
    public void ThirdTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //wait for the search results to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-main-slot.s-result-list")));

        //count the total number of products on the first page
        List<WebElement> productResults = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        int numberOfProducts =  productResults.size();

        Assert.assertTrue(numberOfProducts >= 48, "Count does not match"); //asserting the count
        System.out.println("Number of products found: " + numberOfProducts);

        //count the number of products with 'Socks' in the title
        List<WebElement> productDescription = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

        //Initialize the counter for products with 'Socks' in the title
        int countSocks= 0;

        //for each loop, to iterate through each product description element
        for(WebElement titleElement : productDescription) {
            String titleText = titleElement.getText();   //get the text of the product description element

            //check if the title contains the word 'socks'
            if(titleText.toLowerCase().contains("socks")){
                countSocks++;  //increment the counter if 'socks' is found in the title
            }
        }

        //print out the number of product titles containing the word "socks"
        System.out.println("Number of products with 'Socks' in the title: " + countSocks);
        System.out.println(" ");

        //Collecting all unique product titles
        List<WebElement> productTitle = driver.findElements(By.xpath("//span[@class = 'a-size-base-plus a-color-base']"));

        //Initialize a set to store unique product titles
        Set<String> uniqueTitles = new HashSet<>();

        //Iterate through each product title element
        for(WebElement uniqueTitleElement: productTitle){
            String uniqueTitleText = uniqueTitleElement.getText();  //get the text of the product title element
            uniqueTitles.add(uniqueTitleText);  //add the title to the set of unique titles
        }

        //print out all unique product titles
        System.out.println("unique titles found: ");
        for(String unique: uniqueTitles){
            System.out.println(unique);  //print each unique title
        }
    }

    @AfterClass
    public void tearDown(){
        //close the browser
        driver.quit();
    }

}
