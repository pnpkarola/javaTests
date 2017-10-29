package pl.wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 23.10.17.
 */

public class SeleniumTestCase {

    private WebDriver driver;
    private LoginPage loginPage;
    //    private HomePage homePage;
    private final static String URL = "https://pl.wikipedia.org";

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
    }


    @Parameters({"sUsername", "sPassword"})
    @Test
    public void login(String un,String pa ) {
        loginPage = new LoginPage(driver);
        System.out.println(loginPage.getCurrentUrl());
        HomePage homePage = loginPage.LoginToHomePage(un,pa);
        System.out.println(homePage.getCurrentUrl());
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

}
