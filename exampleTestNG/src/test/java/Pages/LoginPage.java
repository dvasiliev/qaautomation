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


	protected void setName_(String name) {
		name_.sendKeys(name);
	}


	protected void setPassword_(String password) {
		password_.sendKeys(password);
	}

	protected void authBauttonClick() throws InterruptedException {
		driver.findElementsWithWait();
		authButton.submit();
		Thread.sleep(7000);
	}

	@FindBy(id="mailbox__login")
	private WebElement name_;

	@FindBy(id="mailbox__password")
	private WebElement password_;

	@FindBy(id="mailbox__auth__button")
	private WebElement authButton;




}
