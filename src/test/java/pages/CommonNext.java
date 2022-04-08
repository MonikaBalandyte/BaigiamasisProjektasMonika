package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class CommonNext {
    public static void waitForCookiesPopupToBeVisible() {
        WebElement cookiesPopup = Common.getElement(By.xpath("//*[@class='ot-sdk-container']"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cookiesPopup));

    }

    public static void closeCookiePopupByAcceptAll() {
        By locator = By.xpath("//*[@id='onetrust-accept-btn-handler']");
        Common.clickElement(locator);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='ot-sdk-container']")));
    }

    public static void waitForSubscribedTextToAppear() {
        WebElement subscribedText = Common.getElement(By.xpath("//*[@id='nls-thankyou']"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(subscribedText));

    }
}
