package rozetka.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import rozetka.test_base.TestBase;

public class FirstTest extends TestBase {

    @Test
    public void test() {

        mainPage
                .btnMenuClick()
                .btnPickClick()
                .setSeller().setPrice("10000").btnPriceClick().discountProductClick();
        Assert.assertTrue(productPage.discountLabelDisplayed());
    }
}
