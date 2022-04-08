package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utils.Driver;

public class SubscribeOption {
    public static void enterEmailAddress(String message) {
        By locator = By.xpath("//input[@id='txtNLSEmailAddress']");
        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        js.executeScript("window.scrollBy(0,250)", "");

        Common.sendKeys(locator, message);
    }

    public static void clickSubscribeButton() {
        By locator = By.xpath("//button[@id='btnNewsletterSignup']");
        Common.clickElement(locator);
    }

    public static String getConfirmationText() {

        By locator = By.xpath("//*[@id='nls-textcontainer']");
        return Common.getText(locator);
    }
}
