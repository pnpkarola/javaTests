package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by karol on 14.01.18.
 */
public class LoginPage extends Base {
    WebDriver driver;

public LoginPage (WebDriver driver){
    this.driver = driver;
}

public WebElement inputSearch(){return driver.findElement(By.id("searchInput"));}





}
