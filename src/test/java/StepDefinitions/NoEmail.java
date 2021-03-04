
package StepDefinitions;

import Pages.AutomationPractice;
import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NoEmail extends BaseClass {

    AutomationPractice object2;

    @Before
    public void openDriver() {
        setDriver();
    }

    @Given("user is on automationn  practice page for trhird case")
    public void user_is_on_automationn_practice_page_for_trhird_case() {
        object2 = new AutomationPractice(driver);
        System.out.println("home page is opened");
    }

    @When("user clicks first sign in button for third case")
    public void user_clicks_first_sign_in_button_for_third_case() {
        object2.clikFirstSignIn();
    }

    @And("user enters {string} for third case")
    public void user_enters_for_third_case(String password) {
        object2.enterPassword("123456");
    }

    @And("user clicks sign in button for third case")
    public void user_clicks_sign_in_button_for_third_case() {
        object2.clikSecondSignIn();
    }

    @Then("email adress required message should be display")
    public void email_adress_required_message_should_be_display() throws InterruptedException {
        String expected = "An email address required.";
        List<WebElement> els = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        String actual = els.get(0).getText();
        Assert.assertEquals(expected, actual);
        Thread.sleep(2000);
    }


}
