package pl.testerzy;

import org.openqa.selenium.WebDriver;

public class ClientsPage extends BasePage {
    public ClientsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isClientsPageOpen() {
        return driver.getCurrentUrl().contains("klienci");
    }
}
