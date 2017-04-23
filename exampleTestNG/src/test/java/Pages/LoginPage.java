package Pages;

import com.gargoylesoftware.htmlunit.WebAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by DELL on 4/2/2017.
 */
public class LoginPage extends BasePage{


	@FindBy(id="mailbox__login")
	private WebElement name_;

	@FindBy(id="mailbox__password")
	private WebElement password_;

	@FindBy(id="mailbox__auth__button")
	private WebElement authButton;


	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public AfterLoginPage login(String name, String password) throws InterruptedException {
		new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("Title"));
		name_.sendKeys(name);
		password_.sendKeys(password);
		authButton.submit();
		Thread.sleep(7000);
		return new AfterLoginPage(driver);
	}

}
