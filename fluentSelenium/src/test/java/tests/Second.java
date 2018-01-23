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

      lp = new LoginPage(fwd);
//      lp.searchInputSelector.sendKeys("bbbbbbbbbbb");
        System.out.println(lp.getClass());
 //       lp.me();
//      lp.inputSearch().click();
//      lp.inputSearch().sendKeys("klkllk");
//        System.out.println("ss");
      //  lp.checkME();

//       lp.getSearchFormInput().sendKeys("zazazazaza");
//        System.out.println("ceck:"+ lp.getSearchFormInput());
//        lp.getSearchFormInput().size();
        lp.getSearchFormInput().click();

        System.out.println("SIZE: "+lp.getSearchFormInput().click());



    }


}





