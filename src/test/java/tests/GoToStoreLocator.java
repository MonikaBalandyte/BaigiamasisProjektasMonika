package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Common;
import pages.CommonNext;

import utils.Driver;

public class GoToStoreLocator extends BaseTest {
    @BeforeMethod
    public void openPageAndClosePopup() {
        Common.openLink("https://www.next.co.uk");
        CommonNext.waitForCookiesPopupToBeVisible();
        CommonNext.closeCookiePopupByAcceptAll();
    }

    @Test
    public void clickOnStoreLocatorAndOpenPage() {

        pages.GoToStoreLocator.clickGoToStoreOption();
        String expectedOutput = "https://www.next.co.uk/stores";
        String actualOutput = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualOutput, expectedOutput);
    }
}
