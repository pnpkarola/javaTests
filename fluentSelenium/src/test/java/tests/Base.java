package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 14.01.18.
 */
public class Base {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}


