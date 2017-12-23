package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 31.10.17.
 */
public class Tests {
    private WebDriver driver;
    private Login login;
    private final static String URL = "https://book.jetblue.com/B6.auth/login?&service=https://badges.jetblue.com";

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public void login(){
        login = new Login(driver);
        Home home = login.loginToHome("jagla.karol@gmail.com","Karol2017jb");
        home.checkSuccessfullLogin();
        Logout logout = home.logout();
        Assert.assertTrue(logout.we);


    }

    @AfterTest
    public void quit() {
        driver.quit();
    }


}
