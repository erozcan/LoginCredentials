
package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class AutomationPractice extends BaseClass {
    WebDriver driver;

    public AutomationPractice(WebDriver driver) {
        this.driver = driver;
    }

    By txt_email = By.id("email");
    By txt_password = By.id("passwd");
    By btn_firstsignin = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By btn_second_signin = By.id("SubmitLogin");


    public void enterEmail(String email) {

        driver.findElement(txt_email).sendKeys(email);
    }

    public void enterPassword(String password) {

        driver.findElement(txt_password).sendKeys(password);
    }

    public void clikFirstSignIn() {
        driver.findElement(btn_firstsignin).click();

    }

    public void clikSecondSignIn() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        driver.findElement(btn_second_signin).click();
    }


}


