package StepDefinitions;

import Pages.AutomationPractice;
import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IncorrectData extends BaseClass {
    AutomationPractice object4;


    @Given("user is on automation ppractice page")
    public void user_is_on_automation_ppractice_page() {
        object4 = new AutomationPractice(driver);
        System.out.println("home page is opened");
    }

    @When("user clicks first sign in button for fourth case")
    public void user_clicks_first_sign_in_button_for_fourth_case() {

        object4.clikFirstSignIn();
    }

    @And("user entered {string} and {string}")
    public void user_entered_and(String email, String password) {
        object4.enterEmail("test@gmail.com");
        object4.enterPassword("123456");
    }

    @And("user click sign in button for fourth case")
    public void user_click_sign_in_button_for_fourth_case() {
        object4.clikSecondSignIn();
    }

    @Then("authentication failed message should be displayed")
    public void authentication_failed_message_should_be_displayed() throws InterruptedException {
        String expected = "Authentication failed.";
        List<WebElement> els = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        String actual = els.get(0).getText();
        Assert.assertEquals(expected, actual);
        Thread.sleep(2000);
    }


}
