package eldorado.test;

import eldorado.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static eldorado.webelement.ProductPageElement.*;

public class AddProductFromSearchField extends TestBase {

    @Test(priority = 1)

    public void test()  {

        mainPage.inputSearchValue("MacBook")
                .clickSearchButton();

        searchPage.openProductInfo(0);

        productPage.clickBuyProduct()
                .elementIsDisplayed(CART_POPUP.getXpath());

        Assert.assertEquals(productPage.counterCart(),1);
        Assert.assertEquals(productPage.getTitleOfProductNumber(TITLE_OF_PRODUCT.getXpath()),
                productPage.getTitleOfProductNumber(TITLE_OF_PRODUCT_POPUP_CART.getXpath()));

    }
}
