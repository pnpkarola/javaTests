package pl.wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by karol on 23.10.17.
 */
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
