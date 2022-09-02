package rozetka.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import rozetka.specification.TestBase;

public class FirstTest extends TestBase {

    @Test
    public void test() {

        mainPage
                .btnMenuClick()
                .btnPickClick()
                .setSeller().setPrice().btnPriceClick().discountProductClick();
        Assert.assertTrue(productPage.discountLabelDisplayed());
    }
}
