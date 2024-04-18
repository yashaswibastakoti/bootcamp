package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserWindowsTest {

    WebDriver driver;
    WebDriverWait wait;
    String originalWindowHandle;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        originalWindowHandle = driver.getWindowHandle();
    }

    @Test
    public void testBrowserWindows(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement windowButton = driver.findElement(By.id("windowButton"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",windowButton);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"windowButton\"]")));

        driver.findElement(By.id("windowButton")).click();

        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindowHandle.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        WebElement textElement = driver.findElement(By.tagName("body"));
        String text = textElement.getText();
        System.out.println("text on new window: "+ text);

        driver.close();
        driver.switchTo().window(originalWindowHandle);
    }

    @Test(dependsOnMethods = "testBrowserWindows")
    public void testBrowserWindows2(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement tabButton = driver.findElement(By.id("tabButton"));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",tabButton);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tabButton\"]")));

        driver.findElement(By.id("tabButton")).click();

        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindowHandle.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        WebElement textElement = driver.findElement(By.tagName("body"));
        String text = textElement.getText();

        System.out.println("text on new tab: "+ text);

        driver.close();
        driver.switchTo().window(originalWindowHandle);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
