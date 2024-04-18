//package Slack;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class SlackSteps{
//    private WebDriver driver;
//    private WebDriverWait wait;
//    private SlackElements slackElements;
//
//        @Given("I am logged in to Slack")
//        public void i_am_logged_in_to_slack() {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//
//            slackElements = new SlackElements(driver);
//
//            driver.get("https://slack.com/signin#/signin");
//
//            slackElements.clickGoogleSignIn();
//            slackElements.selectGoogleAccount();
//            slackElements.clickSignInButton();
//        }
//
//        @When("I send a message {string} to {string}")
//        public void i_send_a_message(String message, String recipientName) {
//
//            slackElements.clickNewMessageField();
//            slackElements.typeRecipientName(recipientName);
//            slackElements.typeMessage(message);
//        }
//
//        @Then("The message should be sent successfully")
//        public void the_message_should_be_sent_successfully() {
//
//        }
//}
//
