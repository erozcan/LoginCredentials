
package Utils;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BaseClass {


    public static WebDriver driver;


    public static void setDriver() {

        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    public static void closeDriver()  {

        driver.quit();
    }
}


