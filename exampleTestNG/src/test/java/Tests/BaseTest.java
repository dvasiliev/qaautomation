package Tests;

import drivers.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by DELL on 4/8/2017.
 */
public class BaseTest {

    protected WebDriver driver;
    final String BASE_URL = "https://mail.ru/";

    @BeforeSuite
    public void beforeSuite() throws Exception {


        //FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files\\Firefox Developer Edition\\firefox.exe"));
        //FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\Dima\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\v3gry1ir.default"));
        //driver = new FirefoxDriver(profile);
        //driver = new InternetExplorerDriver();
        driver = MyDriverFactory.getDriver();
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        driver.quit();
    }
}
