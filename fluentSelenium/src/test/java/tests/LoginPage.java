package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by karol on 14.01.18.
 */
public class LoginPage extends Base {

    WebDriver wd;

public LoginPage (WebDriver driver){
    this.wd = driver;
}


public WebElement inputSearch(){return wd.findElement(By.id("searchInput"));}

public void ObrazRudika(){
    System.out.println("Rudik Ty szczurze");
}







}
