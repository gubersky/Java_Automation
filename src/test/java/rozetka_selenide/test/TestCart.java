package rozetka_selenide.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rozetka_selenide.pajeobject.CartPage;
import rozetka_selenide.pajeobject.MainPage;
import rozetka_selenide.pajeobject.SearchPage;

import static com.codeborne.selenide.Selenide.*;
import static rozetka_selenide.pajeobject.CategoryPage.clickCategory;

public class TestCart {

    @BeforeMethod
    public void before() {
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testProductCart(){
        new MainPage().clickOnCategory()
                .clickOnLaptopCategory((By) clickCategory)
                .addProduct();
        SearchPage searchPageLogic = new SearchPage();

        Assert.assertEquals(searchPageLogic.cartCounterBtn(), "1");
        searchPageLogic.openCart();

        Assert.assertEquals(searchPageLogic.titleOfFirstProduct(), new CartPage().titleOfProductInCart());
    }

    @AfterMethod
    public void after() {
        closeWebDriver();
    }
}
