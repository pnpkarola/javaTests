package pageobjects;

import org.openqa.selenium.WebDriver;

import static pageobjects.Home.URL;

/**
 * Created by karol on 27.11.17.
 */
public class Registration extends Base {

    public  String url = URL+"registration/";


    public Registration(WebDriver driver) {
        super(driver);
    }


}
