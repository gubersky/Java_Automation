package rozetka_selenide.pajeobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {

    SelenideElement addProductToCart = $(By.xpath("// button [contains(@class, 'buy-button button button--with-icon')]"));
    SelenideElement titleOfProductInCartPopup = $(By.xpath("//a [@ class=\"cart-product__title\"]"));
    SelenideElement closeCartPopup = $(By.xpath("//button [contains(@aria-label, 'Закрыть модальное окно')]"));
    SelenideElement mainPageLogo = $(By.xpath("//img [contains(@alt, 'Rozetka Logo')]"));

    public ProductPage addProductToTheCart(){
        addProductToCart.click();
        return this;
    }

    public String titleOfProduct() {
        return titleOfProductInCartPopup.text().trim();
    }

    public ProductPage closeCartPopup(){
        closeCartPopup.click();
        return this;
    }

    public MainPage goToTheMainPage(){
        mainPageLogo.click();
        return page(MainPage.class);
    }
}
