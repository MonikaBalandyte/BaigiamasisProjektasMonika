package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import utils.Driver;

public class StoreLocator {

    public static void enterCity(String message) {
        By locator = By.xpath("//input[@id='search-input']");
        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        js.executeScript("window.scrollBy(0,20)", "");
        Common.sendKeys(locator, message);
    }

    public static String getResultText() {
        By locator = By.xpath("//input[@id='search-input']");
        return Common.getText(locator);
    }

    public static void selectDropdownOptionByValue(String value) {
        By locator = By.xpath("");
        Common.selectOptionByValue(locator, value);
    }

    public static String getSelectedOptionText() {
        By locator = By.xpath("");
        return Common.getText(locator);
    }
}
