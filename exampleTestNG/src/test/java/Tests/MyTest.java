package Tests;

import Pages.LoginPage;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;


/**
 * Created by DELL on 3/26/2017.
 */
public class MyTest extends BaseTest {

    @Test(description = "Login Test")
    public void testTest() throws Exception {
        app.login.login("mytest_test@mail.ru","33777da");

        Assert.assertEquals(app.afterloginstep.getMailUser(),"mytest_test@mail.ru","Error ");


    }


}
