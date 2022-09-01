package rozetka.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import rozetka.pageobject.MainPageLogic;
import rozetka.pageobject.ProductPageLogic;
import rozetka.testbase.TestBase;

public class FirstTest extends TestBase {

    @Test
    public void test() {

        new MainPageLogic(driver, wait)
                .btnMenuClick()
                .btnPickClick()
                .setSeller().setPrice().btnPriceClick().discountProductClick();
        Assert.assertTrue( new ProductPageLogic(driver, wait).discountLabelDisplayed());
    }
}
