package Steps;

import Pages.AfterLoginPage;

/**
 * Created by Dima on 29.04.2017.
 */
public class AfterLoginStep extends AfterLoginPage{

    public String getMailUser() {
        return userLoginEmail.getText();
    }

}
