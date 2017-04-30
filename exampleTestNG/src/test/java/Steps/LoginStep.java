package Steps;

import Pages.AfterLoginPage;
import Pages.LoginPage;
import User.User;
import org.apache.log4j.Logger;

/**
 * Created by Dima on 29.04.2017.
 */
public class LoginStep extends LoginPage{
    Logger logger = Logger.getLogger("LoginStep");
    public AfterLoginStep login(User user) throws InterruptedException {
        setName_(user.login);
        setPassword_(user.password);
        logger.info(String.format("log user name - %s password - %s",user.login,user.password));
        authBauttonClick();
        return new AfterLoginStep();
    }
}
