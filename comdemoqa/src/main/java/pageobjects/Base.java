package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.WeakHashMap;

/**
 * Created by karol on 27.11.17.
 */
public class Base {
    protected WebDriver driver;
    public Base(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    protected  String checkURL(){
         return driver.getCurrentUrl();
    }




}
