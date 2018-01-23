import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.FluentWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.seleniumhq.selenium.fluent.Period.secs;

/**
 * Created by karol on 23.01.18.
 */
public class FirstTest extends Base {


    HomePage home;
    @Test(priority = 1)
    public void gotoThePage() {

        driver.get("https://www.wikipedia.org");


    }

    @Test(priority = 2)
    public void dealWithFluent() {

        home = new HomePage(driver);
//        home.searchSmth.sendKeys("FLUENT");  // this fluent does not works - problem with page obcjects
        home.
                searchSmthWEB.sendKeys("WEB");  // this one works



       FluentWebElement searchSmth = fdr.input(By.id("searchInput")); //this is initialization of fluentWebElement
        searchSmth.within(secs(5)).sendKeys("Fluent Selenium");

    }


}
