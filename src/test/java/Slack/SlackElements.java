//package Slack;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class SlackElements {
//    WebDriver driver;
//
//    public SlackElements(WebDriver driver){
//        this.driver = driver;
//    }
//
//    By GoogleSignInField =
//            By.xpath("//*[@id=\"google_login_button\"]");
////    By usernameField = By.xpath("//*[@id="identifierId"]");
//    //username=
////    By passwordField = By.xpath("");
////    By GoogleAccountField =
////            By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div/div[2]/div[1]");
////    By SigInButtonField =
////            By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div[2]/div/div/button/span");
//    By NewMessageField =
//            By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/button/svg");
//    By RecipientNameField =
//            By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div[1]/div/div/div[2]");
//    By MessageField=
//            By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div[1]/div/div/div[2]");
//    public void clickGoogleSignIn() {
//
//        driver.findElement(GoogleSignInField).click();
//    }
//
//    public void selectGoogleAccount() {
//
//        driver.findElement(GoogleAccountField).click();
//    }
//
//    public void clickSignInButton() {
//
//        driver.findElement(SigInButtonField).click();
//    }
//
//    public void clickNewMessageField() {
//        driver.findElement(NewMessageField).click();
//    }
//
//    public void typeRecipientName(String recipientName) {
//        WebElement recipientField = driver.findElement(RecipientNameField);
//        recipientField.sendKeys("Harsh Trivedi");
//        recipientField.sendKeys(Keys.ENTER);
//    }
//
//    public void typeMessage(String message) {
//
//        driver.findElement(MessageField).sendKeys("Hello");
//    }
//}
//
