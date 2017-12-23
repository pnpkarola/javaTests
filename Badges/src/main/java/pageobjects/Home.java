package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by karol on 31.10.17.
 */
public class Home extends BasePage {

    @FindBy(linkText = "Badge Collection")
    public WebElement badgeCollection;

    @FindBy(xpath = "//*[@id='jb-header']/div/div[1]/ul/li[5]/a/span")
    public WebElement signout;

    public Home(WebDriver driver){
        super(driver);
    }
    public Boolean elementOnHomePageIsDisplayed(){
    Boolean k=super.verifyDisplay(badgeCollection);
    return k;
    }

    public void checkSuccessfullLogin(){
        super.verifyDisplay(badgeCollection);
        super.verifyDisplay(signout);
    }

    public Logout  logout(){
        signout.click();
        System.out.println("Signout clicked");
        return new Logout(driver);
    }

}
