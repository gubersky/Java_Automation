package eldorado.test;

import eldorado.specification.TestBase;
import eldorado.webelement.CartPageElement;
import org.testng.annotations.Test;

import static eldorado.webelement.CartPageElement.CART_POPUP;
import static eldorado.webelement.CartPageElement.NOTIFICATION_WRAPPER;

public class AddDeleteProductFromMainPage extends TestBase {


    @Test

    public void test() {

        mainPage.clickBuyProduct().elementIsDisplayed(CART_POPUP.getXpath());

        mainPage.goToCart();

        cartPage.deleteProduct();

        mainPage.elementIsDisplayed(NOTIFICATION_WRAPPER.getXpath());


    }
}
