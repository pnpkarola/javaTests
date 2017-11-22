package syncrotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SyncroTests {


    private WebDriver driver;
    private final static String URL = "https://pl.wikipedia.org";
    private WebDriverWait wait;
    WebElement neuschwanstein;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 1);
        driver.get(URL);
    }

    @Test
    public void isDisplayed() {
        driver.get(URL + "/wiki/Neuschwanstein");
        WebElement neuschwanstein = driver.findElement(By.xpath("//*[@id=\'mw-content-text\']/div/table[1]/tbody/tr[2]/td/a/img"));
        if (neuschwanstein.isDisplayed()) neuschwanstein.click();
    }

    @Test
    public void expectedCondition() {
        driver.get(URL + "/wiki/Neuschwanstein");
        WebElement neuschwanstein = driver.findElement(By.xpath("//*[@id=\'mw-content-text\']/div/table[1]/tbody/tr[2]/td/a/img"));
        wait.until(ExpectedConditions.visibilityOf(neuschwanstein));
    }


    @Test
    public void poolingEvery() {
        driver.get(URL + "/wiki/Neuschwanstein");
        WebElement neuschwanstein = driver.findElement(By.xpath("//*[@id=\'mw-content-text\']/div/table[1]/tbody/tr[2]/td/a/img"));
        wait.withTimeout(10, TimeUnit.SECONDS);
        wait.pollingEvery(3, TimeUnit.SECONDS);
        neuschwanstein.click();
    }

    @Test
    public void verifyTextPresent(){
        driver.get(URL + "/wiki/Neuschwanstein");
        String dom = driver.getPageSource();
        Assert.assertTrue(dom.contains("nazywany"));

        boolean g =   driver.getPageSource().contains("nazywany ");
        Assert.assertTrue(g);

        System.out.println(g);

    }



    @AfterTest

    public void termination() {
        driver.quit();

    }


}
