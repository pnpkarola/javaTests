package tests;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by karol on 14.01.18.
 */
public class FirstTests {



    @Test
    public void Test1(){

        System.out.println("1111111111111");
        Assert.assertEquals(2,2);



    }

    @Test
    public void Test2(){

        Assert.assertEquals(2,2);



    }



}
