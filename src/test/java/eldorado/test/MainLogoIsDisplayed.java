package eldorado.test;

import eldorado.specification.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import static eldorado.webelement.MainPageElement.MAIN_LOGO;

public class MainLogoIsDisplayed extends TestBase {

    @Test(priority = 1)
    public void test() {
        Assert.assertTrue(mainPage.elementIsDisplayed(MAIN_LOGO.getXpath()));
    }
}
