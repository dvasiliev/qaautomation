package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static java.sql.JDBCType.NULL;

/**
 * Created by Dima on 09.04.2017.
 */
public class MyDriverFactory {
    public static WebDriver getDriver(){
        String property = System.getProperty("driver");
        switch (property){
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                return new FirefoxDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                return new ChromeDriver();
        }

    }
}
