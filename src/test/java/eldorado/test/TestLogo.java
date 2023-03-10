package eldorado.test;

import eldorado.test_base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import static eldorado.locators.MainPageElement.MAIN_LOGO;

public class TestLogo extends TestBase {

    @Test(priority = 1)
    public void logoMainPage() {
        Assert.assertTrue(app.basePage().elementIsDisplayed(MAIN_LOGO.getLocator()));
    }
}
