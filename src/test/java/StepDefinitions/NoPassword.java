
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

public class NoPassword extends BaseClass {

    AutomationPractice object3;


    @Given("user is on automation page for second case")
    public void user_is_on_automation_page_for_second_case() {
        object3 = new AutomationPractice(driver);
        System.out.println("home page is opened");
    }

    @When("user clicks first sign in button for second case")
    public void user_clicks_first_sign_in_button_for_second_case() {
        object3.clikFirstSignIn();
    }

    @And("user enters {string} for second case")
    public void user_enters_for_second_case(String email) throws InterruptedException {
        object3.enterEmail("test@gmail.com");
        Thread.sleep(2000);
    }

    @And("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        object3.clikSecondSignIn();
    }

    @Then("password required message should be display")
    public void password_required_message_should_be_display() throws InterruptedException {
        String expected = "Password is required.";
        List<WebElement> els = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        String actual = els.get(0).getText();
        Assert.assertEquals(expected, actual);
        Thread.sleep(2000);
    }

    @After
    public void clsDriver() {
        closeDriver();
    }
}


