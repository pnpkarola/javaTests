package pl.wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;

/**
 * Created by karol on 23.10.17.
 */
public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id='pt-login']/a")
    private WebElement lnkZaloguj;

    @FindBy(id ="wpName1")
    private WebElement inputUsername;

    @FindBy(id="wpPassword1")
    private  WebElement inputPassword;

    @FindBy(id="wpLoginAttempt")
    private WebElement btnZaloguj;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    @Parameters({"sUsername","sPassword"})
    public HomePage LoginToHomePage(String p1,String p2){
        lnkZaloguj.click();
        inputUsername.sendKeys(p1);
        inputPassword.sendKeys(p2);
        btnZaloguj.click();
        return new HomePage(driver);
    }


}
