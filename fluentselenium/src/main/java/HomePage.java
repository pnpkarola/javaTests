import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.selenium.fluent.FluentWebDriver;
import org.seleniumhq.selenium.fluent.FluentWebElement;

/**
 * Created by karol on 23.01.18.
 */
public class HomePage {
    WebDriver driver;
    FluentWebDriver fdr;

    @FindBy(id = "searchInput")
    FluentWebElement searchSmth;
    //this FluentWebElement does not works

    @FindBy(xpath = "//*[@id='search-form]/fieldset/button")
    WebElement go;

    @FindBy(id = "searchInput")
    WebElement searchSmthWEB;
    // it is no problem with Webelement

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
