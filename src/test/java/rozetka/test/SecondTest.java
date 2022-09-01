package rozetka.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rozetka.testbase.TestBase;
import rozetka_selenide.pajeobject.CartPageLogic;
import rozetka_selenide.pajeobject.MainPageLogic;
import rozetka_selenide.pajeobject.ProductPageLogic;

import static com.codeborne.selenide.Selenide.*;

public class SecondTest {

    @BeforeMethod
    public void before() {

        open("https://rozetka.com.ua/");
    }

    @Test
    public void testProductCart(){
        new MainPageLogic().findProductInSearchField()
                .openProductPage()
                .addProductToTheCart().closeCartPopup()
                .goToTheMainPage().openCartPage();

        Assert.assertEquals(new ProductPageLogic().titleOfProduct(), new CartPageLogic().titleOfProductInCart());
    }

    @AfterMethod
    public void after() {
        closeWebDriver();
    }
}
