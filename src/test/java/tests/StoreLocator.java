package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.Common;
import pages.CommonNext;

import utils.TestListener;

@Listeners(TestListener.class)

public class StoreLocator extends BaseTest {
    @BeforeMethod
    public void openLink() {

        Common.openLink("https://www.next.co.uk/stores");
        CommonNext.waitForCookiesPopupToBeVisible();
        CommonNext.closeCookiePopupByAcceptAll();
    }

    @Test
    public void insertCityToStoreLocator() {

        String actualInput = "London";
        String actualOutput;

        pages.StoreLocator.enterCity(actualInput);
        pages.SubscribeOption.clickSubscribeButton();

        actualOutput = pages.StoreLocator.getResultText();

        Assert.assertEquals(actualOutput, actualOutput);
    }
}
