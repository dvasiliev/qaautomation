package Tests;

import drivers.MyDriverFactory;
import javafx.application.Application;
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

    MyApplication app;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        app = new MyApplication();
        app.common.startDriver();
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        app.common.stopDriver();
    }
}
