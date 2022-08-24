package eldorado.test;

import eldorado.testbase.TestBase;
import org.testng.annotations.Test;

import static eldorado.webelement.MainPageElement.PROMOTIONAL_OFFERS;

public class SharesIsDisplayed extends TestBase {



    @Test
    public void test(){
        for (int i = 0; i < 20; i++) {
            mainPage.elementIsDisplayed(PROMOTIONAL_OFFERS.getXpath());
        }
    }
}
