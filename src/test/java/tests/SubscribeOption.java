package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.Common;
import pages.CommonNext;

import utils.TestListener;


@Listeners(TestListener.class)
public class SubscribeOption extends BaseTest {
    @BeforeMethod
    public void openPageAndClosePopup() {

        Common.openLink("https://www.next.co.uk");
        CommonNext.waitForCookiesPopupToBeVisible();
        CommonNext.closeCookiePopupByAcceptAll();
    }

    @Test
    public void subscribeOption() {

        String expectedOutput = "Thanks for subscribing. We’ll be in touch to keep you updated with the latest news, including offers, promotions, sale and store events.";
        String actualInput = "m.balandyte@gmail.com";
        String actualOutput;

        pages.SubscribeOption.enterEmailAddress(actualInput);
        pages.SubscribeOption.clickSubscribeButton();
        CommonNext.waitForSubscribedTextToAppear();

        actualOutput = pages.SubscribeOption.getConfirmationText();

        Assert.assertEquals(actualOutput, expectedOutput);
    }
}


