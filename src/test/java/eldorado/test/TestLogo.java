package eldorado.test;

import eldorado.config.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import static eldorado.locators.MainPageElement.MAIN_LOGO;

public class TestLogo extends TestBase {

    @Test(priority = 1)
    public void logoMainPage() {
        Assert.assertTrue(mainPage.elementIsDisplayed(MAIN_LOGO.getXpath()));
    }
}
