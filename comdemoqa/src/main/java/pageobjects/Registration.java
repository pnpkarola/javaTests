package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertFalse;
import static pageobjects.Home.URL;

/**
 * Created by karol on 27.11.17.
 */
public class Registration extends Base {

    public String url = URL + "registration/";

    @FindBy(id = "name_3_firstname")
    WebElement firstname_inp;
    @FindBy(id = "name_3_lastname")
    WebElement lastname_inp;
    @FindBy(xpath = "//*[@id='pie_register']/li[2]/div/div/input[2]")
    WebElement married_rbt;
    @FindBy(xpath = "//*[@id='pie_register']/li[3]/div/div[1]/input[1]")
    WebElement dance_cbox;
    @FindBy(xpath = "//*[@id='profile_pic_10']")
    WebElement chooseFile;
    @FindBy(id = "phone_9")
    WebElement phoneNou;
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "email_1")
    WebElement email;
    @FindBy (id = "description")
    WebElement aboutYourself;
    @FindBy(id = "password_2")
    WebElement password_inpt;
    @FindBy(id = "confirm_password_password_2")
    WebElement confirmPass;
    @FindBy(name = "pie_submit")
    WebElement submit_btn;







    public Registration(WebDriver driver) {
        super(driver);
    }

    public void fillTheFormula(String fn, String ln) {
        if (firstname_inp.isDisplayed() && lastname_inp.isDisplayed()) {
            firstname_inp.clear();
            firstname_inp.sendKeys(fn);
            lastname_inp.clear();
            lastname_inp.sendKeys(ln);
            if (!married_rbt.isSelected()) married_rbt.click();
            if (!dance_cbox.isSelected()) dance_cbox.click();
        }

    }

    public void country_DropDown() {
        // Pobranie menu rozwijanego jako obiektu Select na podstawie atrybutu name
        Select make = new Select(driver.findElement(By.name("dropdown_7")));
        // Sprawdzenie, czy menu rozwijane obsługuje wybór wielokrotny
        assertFalse(make.isMultiple());
        System.out.println("Ile opcji " + make.getOptions().size());
        System.out.println("Jest multiple " + make.isMultiple());
        make.selectByVisibleText("Albania");
        Base.myPause(1000);
        make.selectByValue("Argentina");
        Base.myPause(1000);
        make.selectByIndex(10);
        Base.myPause(1000);
    }

    public void dateOfBirth() {
        Select dOB_month = new Select(driver.findElement(By.id("mm_date_8")));
        Select dOB_day = new Select(driver.findElement(By.id("dd_date_8")));
        Select dOB_year = new Select(driver.findElement(By.id("yy_date_8")));

        if (!dOB_month.isMultiple() && !dOB_day.isMultiple() && !dOB_year.isMultiple()) {
            dOB_month.selectByVisibleText("1");
            dOB_day.selectByVisibleText("4");
            dOB_year.selectByVisibleText("1985");
        }
    }

    public void chooseFile() {
        driver.manage().window().maximize();
        if (chooseFile.isDisplayed()) {
            try {
                chooseFile.sendKeys("/home/karol/Downloads/IMG_20171028_160724.jpg");
            } catch (Exception e) {
                System.out.println("Przyczyna:" + e.getLocalizedMessage());

            }
        }


    }
    public void fillTheFormulaRest(String mail){
//        phoneNou.sendKeys("04864943571");
//        username.sendKeys("Lwola");
        email.sendKeys(mail);
//        aboutYourself.sendKeys("Simple me");
//        password_inpt.sendKeys("Karol2017@");
//        confirmPass.sendKeys("Karol2017@");
//        submit_btn.click();
        Base.myPause(2000);
    }


    

}
