package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 14.01.18.
 */
public class Base {

    WebDriver driver;



    WebDriver wd;
    FluentWebDriver fwd;


    @BeforeTest
    public void setup() {
        fwd = new FluentWebDriver(wd);
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("https://www.wikipedia.org/");
    }

    @AfterTest
    public void tearDown(){
        wd.quit();
    }
}


