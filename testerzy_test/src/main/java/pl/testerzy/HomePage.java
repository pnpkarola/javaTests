package pl.testerzy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Set;


public class HomePage extends BasePage {

    private String url;

    @FindBy(id = "ukryj")
    private WebElement cookiesButton;

    @FindBy(xpath = "//*[@class='flickr']/a")
    private WebElement youtubeButton;

    public HomePage(WebDriver driver, String url) {
        super(driver);
        this.url = url;
    }

    public HomePage open() {
        driver.get(url);
        return this;
    }

    public HomePage closeCookiesMessage() {
        cookiesButton.click();
        return this;
    }

    public boolean hasNoCookiesMessage() {
        //TODO: instead try catch
        return !driver.findElements(By.id("panel_cookie_dol")).isEmpty();
    }

    public YouTubePage goToYouTube() {
        String currentWindow = driver.getWindowHandle();
        scrollTo(youtubeButton);
        youtubeButton.click();
        switchToNewWindow(currentWindow);
        return new YouTubePage(driver);
    }
}
