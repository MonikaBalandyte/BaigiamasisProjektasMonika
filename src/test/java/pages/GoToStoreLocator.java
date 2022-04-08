package pages;

import org.openqa.selenium.By;

public class GoToStoreLocator {

    public static void clickGoToStoreOption() {
        By locator = By.xpath("//*[@data-link-name='Store Locator'] | //*[@data-ga-v2='Store Locator']");
        Common.clickElement(locator);
    }
}
