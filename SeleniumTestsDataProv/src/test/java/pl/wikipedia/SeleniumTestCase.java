package pl.wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 23.10.17.
 */

public class SeleniumTestCase {

    private WebDriver driver;
    private LoginPage loginPage;
    //    private HomePage homePage;
    private final static String URL = "https://pl.wikipedia.org";

    @Parameters({"sUsername","sPassword"})
//    @BeforeTest
//    public void setup() {
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get(URL);
//    }


    @Test
//    @Parameters({ "sUsername", "sPassword" })
//    @Parameters({"param1","param2"})

//    public void voidPrintParam(String p1, String p2) {
//        System.out.println("Parameter Example: Data(" + p1 + ", " + p2 + ")");
//        System.out.println(p2);
//    }



    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{"kjagla", "wiki.098"}, {"kjagla", "wiki.098"}};

    }

//    @Test(dataProvider="getData")
//    public void instanceDbProvider(String p1, String p2) {
//        System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
//    }

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test(dataProvider="getData")

    public void login(String p1, String p2) {
        System.out.println("dejtaprov: Data(" + p1 + ", " + p2 + ")");
        loginPage = new LoginPage(driver);
        System.out.println(loginPage.getCurrentUrl());
        HomePage homePage = loginPage.LoginToHomePage(p1,p2);
        System.out.println(homePage.getCurrentUrl());
    }



    @AfterMethod
    public void quit() {
        driver.quit();
    }

}
