package eldorado.test;

import eldorado.test_base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static eldorado.locators.ProductPageElement.*;

public class TestProduct extends TestBase {

    @Test(priority = 1)

    public void productInCart() {

        app.mainPage().inputSearchValue("MacBook")
                .clickSearchButton();

        app.searchPage().openProductInfo(7);

        app.productPage().clickBuyProduct();
        app.basePage().elementIsDisplayed(CART_POPUP.getLocator());

        Assert.assertEquals(app.productPage().counterCart(), 1);
        Assert.assertEquals(app.productPage().getTitleOfProductNumber(TITLE_OF_PRODUCT.getLocator()),
                app.productPage().getTitleOfProductNumber(TITLE_OF_PRODUCT_POPUP_CART.getLocator()));

    }
}
