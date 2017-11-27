package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by karol on 27.11.17.
 */
public class Home extends Base {

    @FindBy(xpath = "//*[@id='post-9']/header/h1")
    public WebElement homeLogo;

    @FindBy(id = "menu-item-374")
    public WebElement registration_btn;

    public static String URL = "http://demoqa.com/";

    public Home(WebDriver driver) {
        super(driver);
    }

    public Registration goToRegistration() {
        if (registration_btn.isDisplayed()) {
            registration_btn.click();
        }
        return new Registration(driver);
    }

}
