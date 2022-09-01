package rozetka.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import rozetka.pageobject.MainPage;
import rozetka.pageobject.ProductPage;
import rozetka.testbase.TestBase;

public class FirstTest extends TestBase {

    @Test
    public void test() {

        new MainPage(driver, wait)
                .btnMenuClick()
                .btnPickClick()
                .setSeller().setPrice().btnPriceClick().discountProductClick();
        Assert.assertTrue( new ProductPage(driver, wait).discountLabelDisplayed());
    }
}
