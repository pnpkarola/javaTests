package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.Home;
import pageobjects.Registration;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * Created by karol on 27.11.17.
 */
public class Tests {
    private WebDriver driver;
    private Home home;
    private WebDriverWait wait;
    private Registration registration;

    private static final String URL = "http://demoqa.com";

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void HomePage() {
        home = new Home(driver);
        wait.until(ExpectedConditions.visibilityOf(home.homeLogo));
        Assert.assertEquals(home.URL,driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(home.registration_btn));
        registration = home.goToRegistration();

    }

    @Test
    public void registrationPage(){

        Assert.assertEquals(registration.url,driver.getCurrentUrl());
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }

}
