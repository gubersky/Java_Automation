package rozetka_selenide.pajeobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

SelenideElement searchField = $(By.name("search"));
SelenideElement searchButton = $(By.xpath("//button [contains(@class,\"search-form__submit ng-star-inserted\")]"));
SelenideElement openCart = $(By.xpath("//button [@class=\"header__button ng-star-inserted header__button--active\"]"));
SelenideElement menuPicker = $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));


    public MainPage findProductInSearchField(){
        searchField.setValue("MD506Z/A");
        return this;
    }

    public ProductPage openProductPage(){
        searchButton.click();
        return page(ProductPage.class);
    }

    public CartPage openCartPage(){
        openCart.click();
        return page(CartPage.class);
    }

    public CategoryPage clickOnCategory(){
        menuPicker.click();
        return page(CategoryPage.class);
    }
}
