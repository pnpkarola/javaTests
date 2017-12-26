package pl.testerzy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//*[contains(@class,'badge-info')]")
    private WebElement resultNumber;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public int hasResults() {
        return Integer.parseInt(resultNumber.getText());
    }
}
