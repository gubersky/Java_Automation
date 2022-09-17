package eldorado.test;

import eldorado.specification.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import static eldorado.webelement.CartPageElement.CART_POPUP;
import static eldorado.webelement.CartPageElement.NOTIFICATION_WRAPPER;


public class AddDeleteProductFromMainPage extends TestBase {


    @Test

    public void test() throws InterruptedException {

        mainPage.clickBuyProduct();
        Assert.assertTrue(mainPage.elementIsDisplayed(CART_POPUP.getXpath()));

        mainPage.goToCart();

        cartPage.deleteProduct();

        Assert.assertTrue(mainPage.elementIsDisplayed(NOTIFICATION_WRAPPER.getXpath()));

    }
}
