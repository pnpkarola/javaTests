package pl.testerzy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected void switchToNewWindow(String oldWindow) {
        Set<String> windows = driver.getWindowHandles();
//
//        windows.stream()
//                .filter(newWindow -> !newWindow.equals(oldWindow))
//                .forEach(driver.switchTo().window(newWindow));


        for (String newWindow : windows) {
            if (!newWindow.equals(oldWindow)){
                driver.switchTo().window(newWindow);
            }
        }
    }
}
