package first.testng;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelDataProvider {

    public WebDriver driver;
    public WebDriverWait wait;
    String appURL = "https://www.linkedin.com/";

    //Locators
    private By Cookie = By.id("dismiss-alert");
    private By byEmail = By.id("login-email");
    private By byPassword = By.id("login-password");
    private By bySubmit = By.id("login-submit");
    private By byError = By.id("global-alert-queue");

    String byCookieStr = "//*[@id='dismiss-alert']";
    private By byCookie = By.xpath(byCookieStr);


    @BeforeClass
    public void testSetup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }


    @Test(dataProvider = "empLogin")

    public void VerifyInvalidLogin(String userName, String password) {


        driver.navigate().to(appURL);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if (driver.findElements(By.xpath(byCookieStr)).size() != 0) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail));
            driver.findElement(byEmail).sendKeys(userName);
            driver.findElement(byPassword).sendKeys(password);
            //wait for element to be visible and perform click
            wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
            driver.findElement(bySubmit).click();

            //Check for error message
            wait.until(ExpectedConditions.presenceOfElementLocated(byError));
            String actualErrorDisplayed = driver.findElement(byError).getText();
            String cookiePolicy = "This website uses cookies to improve service and provide tailored ads. By using this site, you agree to this use. See our Cookie Policy.";
            Assert.assertEquals(cookiePolicy, actualErrorDisplayed);
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail));
            driver.findElement(byEmail).sendKeys(userName);
            driver.findElement(byPassword).sendKeys(password);
            //wait for element to be visible and perform click
            wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
            driver.findElement(bySubmit).click();

            //Check for error message
            wait.until(ExpectedConditions.presenceOfElementLocated(byError));
            String actualErrorDisplayed = driver.findElement(byError).getText();

            String requiredErrorMessage = "There were one or more errors in your submission. Please correct the marked fields below.";
            Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);


        }


    }

    @DataProvider(name = "empLogin")
    public Object[][] loginData() {
        Object[][] arrayObject = getExcelData("/home/karol/javaTests/TestNG_training/src/excelFile.xls", "Sheet1");
        System.out.println(arrayObject);
        return arrayObject;
    }

    //    /**
//     * @param File Name
//     * @param Sheet Name
//     * @return
//     */
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

    @Test
    public void tearDown() {
        driver.quit();
    }

}
