package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FormElements {

    WebDriver driver;

    public FormElements(WebDriver driver){

        this.driver = driver;
    }

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By gender = By.id("gender-radio-1");
    By mobile = By.id("userNumber");
    By DoB = By.id("dateOfBirthInput");
    By enterSubject = By.id("subjectsInput");
    By hobbies = By.id("hobbies-checkbox-1");
    By picture = By.id("uploadPicture");
    By enterAddress = By.id("currentAddress");
    By StateCity = By.id("stateCity-wrapper");


    public void enterFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void enterLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void enterEmail(String UserEmail){
        driver.findElement(email).sendKeys(UserEmail);
    }
    public void selectGender(){
        driver.findElement(gender).click();
    }
    public void enterMobile(String MobileNumber){
        driver.findElement(mobile).sendKeys(MobileNumber);
    }

    public void enterDoB(String UserDoB){
        driver.findElement(DoB).sendKeys(UserDoB);
    }

    public void enterSubject(String UserSubject){
        driver.findElement(enterSubject).sendKeys(UserSubject);
        driver.findElement(enterSubject).sendKeys(Keys.ENTER);
    }
    public void selectHobbies(){
        driver.findElement(hobbies).click();
    }

    public void enterPicture(String UserPic ){
        driver.findElement(picture).sendKeys(UserPic);
    }
    public void enterAddress(String address){
    driver.findElement(enterAddress).sendKeys(address);
    }
    public void enterStateCity(String UserStateCity){
        driver.findElement(StateCity).sendKeys(UserStateCity);
    }

}

