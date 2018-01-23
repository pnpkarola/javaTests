import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.FluentWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 23.01.18.
 */
public class Base {

WebDriver driver;
FluentWebDriver fdr;



    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        fdr = new FluentWebDriver(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterTest
    public void close(){
        driver.quit();
    }


}
