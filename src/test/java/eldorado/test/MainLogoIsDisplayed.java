package eldorado.test;

import eldorado.specification.TestBase;
import org.testng.annotations.Test;
import static eldorado.webelement.MainPageElement.MAIN_LOGO;

public class MainLogoIsDisplayed extends TestBase {

    @Test(priority = 1)
    public void test() {
        mainPage.elementIsDisplayed(MAIN_LOGO.getXpath());
    }
}
