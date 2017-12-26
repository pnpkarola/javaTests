package pl.testerzy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuModule extends BasePage {

    @FindBy(xpath = "//li[@class='item-55']")
    private WebElement knowledgeBaseLink;

    @FindBy(xpath = "//li[@class='item-331']")
    private WebElement clientsLink;

    @FindBy(id = "mod-search-searchword")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@value='Szukaj']")
    private WebElement searchButton;

    public NavigationMenuModule(WebDriver driver) {
        super(driver);
    }

    public KnowledgePage clickOnKnowledgeBase() {
        knowledgeBaseLink.click();
        return new KnowledgePage(driver);
    }

    public ClientsPage clickOnClients() {
        clientsLink.click();
        return new ClientsPage(driver);
    }

    public SearchResultPage searchPhrase(String phrase) {
        searchInput.sendKeys(phrase);
        searchButton.click();
        return new SearchResultPage(driver);
    }
}
