package Pages;

import drivers.MyDriver;
import drivers.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DELL on 4/2/2017.
 */
public class BasePage {
    protected static final MyDriver driver = new MyDriver();
    protected final String BASE_URL = "https://mail.ru/";

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
