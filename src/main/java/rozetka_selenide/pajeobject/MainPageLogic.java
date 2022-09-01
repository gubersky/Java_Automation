package rozetka_selenide.pajeobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic {

SelenideElement searchField = $(By.name("search"));
SelenideElement searchButton = $(By.xpath("//button [contains(@class,\"search-form__submit ng-star-inserted\")]"));
SelenideElement openCart = $(By.xpath("//button [@class=\"header__button ng-star-inserted header__button--active\"]"));


    public MainPageLogic findProductInSearchField(){
        searchField.setValue("MD506Z/A");
        return this;
    }

    public ProductPageLogic openProductPage(){
        searchButton.click();
        return page(ProductPageLogic.class);
    }

    public CartPageLogic openCartPage(){
        openCart.click();
        return page(CartPageLogic.class);
    }
}
