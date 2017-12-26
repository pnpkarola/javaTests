package pl.testerzy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class SeleniumTestCase {

    private static final String FILE_PATH = "./FailedTestsScreenshots/";
    private WebDriver driver;
    protected HomePage homePage;
    protected NavigationMenuModule navigationMenuModule;

    private final static String URL = "http://testerzy.pl/";

    @BeforeMethod
    public void openBrowser() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/local//bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openSite() throws Exception {
        homePage = new HomePage(driver, URL).open();
        navigationMenuModule = new NavigationMenuModule(driver);
    }

    @AfterMethod
    public void closeBrowser(ITestResult result) throws Exception {
        if (ITestResult.FAILURE == result.getStatus()) {
            String testName = result.getName();
            takeScreenShot(testName + ".png");
        }
        driver.quit();
    }

    private void takeScreenShot(String testName) throws IOException {

        String fileName = String.format("%s_%s", DataTestGenerator.getTodayAndTime(), testName);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File fileOnDisc = new File(FILE_PATH + fileName);
        FileUtils.copyFile(screenshot, fileOnDisc);
    }
}

