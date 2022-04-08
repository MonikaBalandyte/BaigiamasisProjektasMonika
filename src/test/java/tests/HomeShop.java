package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Common;
import pages.CommonNext;

import utils.Driver;

public class HomeShop extends BaseTest {
    @BeforeMethod
    public void openLink() {
        Common.openLink("https://www.next.co.uk/homeware");
        CommonNext.waitForCookiesPopupToBeVisible();
        CommonNext.closeCookiePopupByAcceptAll();
    }

    @Test
    public void clickOnStoreLocatorAndOpenPage() {

        pages.HomeShop.clickGoToLivingRoom();
        String expectedOutput = "https://www.next.co.uk/shop/department-homeware-productaffiliation-livingroom-0";
        String actualOutput = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualOutput, expectedOutput);
    }
}

