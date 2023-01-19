package eldorado.test;

import eldorado.test_base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static eldorado.locators.ProductPageElement.*;

public class TestProduct extends TestBase {

    @Test(priority = 1)

    public void productInCart()  {

        mainPage.inputSearchValue("MacBook")
                .clickSearchButton();

        searchPage.openProductInfo(7);

        productPage.clickBuyProduct()
                .elementIsDisplayed(CART_POPUP.getXpath());

        Assert.assertEquals(productPage.counterCart(),1);
        Assert.assertEquals(productPage.getTitleOfProductNumber(TITLE_OF_PRODUCT.getXpath()),
                productPage.getTitleOfProductNumber(TITLE_OF_PRODUCT_POPUP_CART.getXpath()));

    }
}
