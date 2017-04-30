package Tests;

import Steps.AfterLoginStep;
import Steps.CommonSteps;
import Steps.LoginStep;

/**
 * Created by Dima on 29.04.2017.
 */
public class MyApplication {
    LoginStep login=new LoginStep();
    AfterLoginStep afterloginstep = new AfterLoginStep();
    CommonSteps common = new CommonSteps();
}
