package rozetka.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rozetka_selenide.pajeobject.CartPage;
import rozetka_selenide.pajeobject.MainPage;
import rozetka_selenide.pajeobject.ProductPage;

import static com.codeborne.selenide.Selenide.*;

public class SecondTest {

    @BeforeMethod
    public void before() {

        open("https://rozetka.com.ua/");
    }

    @Test
    public void testProductCart(){
        new MainPage().findProductInSearchField("Mac")
                .openProductPage()
                .addProductToTheCart().closeCartPopup()
                .goToTheMainPage().openCartPage();

        Assert.assertEquals(new ProductPage().titleOfProduct(), new CartPage().titleOfProductInCart());
    }

    @AfterMethod
    public void after() {
        closeWebDriver();
    }
}
