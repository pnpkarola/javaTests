package pl.testerzy;

import org.openqa.selenium.WebDriver;

public class KnowledgePage extends BasePage {
    public KnowledgePage(WebDriver driver) {
        super(driver);
    }

    public boolean isKnowledgeBasePageOpen() {
        return driver.getCurrentUrl().contains("baza-wiedzy");
    }
}
