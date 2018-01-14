package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by karol on 14.01.18.
 */
public class Second extends Base{

    LoginPage lp;

    @Test
    public  void one(){

        System.out.println("1");
        Assert.assertEquals(1,1);

    }

    @Test
    public void checkWiki(){

      lp = new LoginPage(driver);
      lp.inputSearch().click();
      lp.inputSearch().sendKeys("klkllk");
        System.out.println("ss");



    }


}





