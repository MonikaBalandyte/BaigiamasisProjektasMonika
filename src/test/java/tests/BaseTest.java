package tests;

import org.testng.annotations.*;

import utils.Driver;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void init() {
        Driver.initialize();
    }

    @AfterMethod
    public void quit() {
        Driver.quit();
    }
}
