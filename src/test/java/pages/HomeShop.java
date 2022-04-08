package pages;

import org.openqa.selenium.By;

public class HomeShop {

    public static void clickGoToLivingRoom() {
        By locator = By.xpath("//*[@id=\"buttonlist3\"]/div[2]/div/div/div[1]/a");
        Common.clickElement(locator);
    }
}

