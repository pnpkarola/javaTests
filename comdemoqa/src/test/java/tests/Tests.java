package tests;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.Base;
import pageobjects.Home;
import pageobjects.Registration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * Created by karol on 27.11.17.
 */
public class Tests {
    private WebDriver driver;
    private Home home;
    private WebDriverWait wait;
    private Registration registration;

    private static final String URL = "http://demoqa.com";

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(URL);
        wait = new WebDriverWait(driver, 30);
    }

    @Test
    public void HomePage() {
        home = new Home(driver);
        wait.until(ExpectedConditions.visibilityOf(home.homeLogo));
        Assert.assertEquals(home.URL,driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(home.registration_btn));
        registration = home.goToRegistration();


    }

    @Test
    public void registrationPage(){

        Assert.assertEquals(registration.url,driver.getCurrentUrl());
        registration.fillTheFormula("Karol","Jagla");
        registration.country_DropDown();
        registration.dateOfBirth();
        registration.chooseFile();

        Base.myPause(3000);
    }

    public String[][] getExcelData(String fileName, String sheetName) {
        String[][] arrayExcelData = null;
        try {
            FileInputStream fs = new FileInputStream(fileName);
            Workbook wb = Workbook.getWorkbook(fs);
            Sheet sh = wb.getSheet(sheetName);

            int totalNoOfCols = sh.getColumns();
            int totalNoOfRows = sh.getRows();

            arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols];

            for (int i = 1; i < totalNoOfRows; i++) {

                for (int j = 0; j < totalNoOfCols; j++) {
                    arrayExcelData[i - 1][j] = sh.getCell(j, i).getContents();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return arrayExcelData;
    }




    @DataProvider (name="mail")
    public Object[][] loginData() {
        Object[][] arrayObject = getExcelData("/home/karol/javaTests/comdemoqa/src/data.xls", "data");
        System.out.println(arrayObject);
        return arrayObject;
    }



    @Test(dataProvider = "mail")
    public void verifyMyMail(String mail){
        registration.fillTheFormulaRest(mail);


    }




    @AfterTest
    public void quit(){
        driver.quit();
    }

}
