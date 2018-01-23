package tests;

import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.selenium.fluent.FluentWebDriver;


/**
 * Created by karol on 14.01.18.
 */
public class LoginPage extends Base {

FluentWebDriver fwd;



    @FindBy(id = "searchInput")
    public FluentWebElement searchInputSelector;
    @FindBy(id = "searchInput")
    public FluentWebElement searchInput;

    public FluentWebElement getSearchFormInput() {
        return searchInput;
    }


    public LoginPage (FluentWebDriver driver){fwd = driver;
//        PageFactory.initElements(driver, this);
}


//
//    public FluentWebElement getSearchInput() {
//        return searchInput;
//    }



//
//    public FluentWebElement getSearchFormInput() {
//        return searchInputSelector;
//    }
////
////    public void checkME(){
////        System.out.println("My: "+this.getClass());
////    }


    public void me(){
//        System.out.println( "jestem w me()");
////        searchInputSelector.click();
////        searchInputSelector.sendKeys("ddd");
//        searchInput.sendKeys("webelement");
//
//
////        System.out.println("bcncbcbcb");
//////        f.sendKeys("jjjj");
//        System.out.println(f.getClass());
    }

//public WebElement inputSearch(){return wd.findElement(By.id("searchInput"));}









}
