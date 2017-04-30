package Steps;

import Pages.AfterLoginPage;
import Pages.LoginPage;
import org.apache.log4j.Logger;

/**
 * Created by Dima on 29.04.2017.
 */
public class LoginStep extends LoginPage{
    Logger logger = Logger.getLogger("LoginStep");
    public AfterLoginStep login(String name, String password) throws InterruptedException {
        setName_(name);
        setPassword_(password);
        logger.info(String.format("log user name - %s password - %s",name,password));
        authBauttonClick();
        return new AfterLoginStep();
    }
}
