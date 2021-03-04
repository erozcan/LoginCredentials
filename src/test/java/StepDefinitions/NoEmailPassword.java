

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

public class NoEmailPassword extends BaseClass {

    AutomationPractice object1;


    @Given("user is on automationpractice page")
    public void user_is_on_automationpractice_page() throws InterruptedException {
        object1 = new AutomationPractice(driver);
        System.out.println("home page is open");
        Thread.sleep(1000);
    }

    @When("user click first sign in button")
    public void user_click_first_sign_in_button() throws InterruptedException {
        object1.clikFirstSignIn();
        Thread.sleep(1000);
    }

    @And("click second sign in button")
    public void click_second_sign_in_button() {
        object1.clikSecondSignIn();
    }

    @Then("email address required message should be displayed")
    public void email_address_required_message_should_be_displayed() throws InterruptedException {
        String expected = "An email address required.";
        List<WebElement> els = driver.findElements(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
        String actual = els.get(0).getText();
        Assert.assertEquals(expected, actual);
        Thread.sleep(2000);

    }


}


