package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by karol on 31.10.17.
 */
public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected Boolean verifyDisplay(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("DISPLAYED6");
            return true;
        }
        else if(element.isEnabled()) {
            System.out.println("ENABLED");
            return true;
        } else {
            System.out.println("BRAK");
            return false;
        }
    }

    Boolean Displayed(WebElement e) {
        if (e.isDisplayed()) return true;
        else return false;
    }
}
