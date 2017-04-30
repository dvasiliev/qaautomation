package Steps;

import Pages.BasePage;

/**
 * Created by Dima on 29.04.2017.
 */
public class CommonSteps extends BasePage {
    public void startDriver(){
        driver.get(BASE_URL);
    }

    public void stopDriver(){
        driver.quit();
    }
}
