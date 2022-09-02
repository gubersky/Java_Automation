package rozetka_selenide.pajeobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {


    SelenideElement clickAddProduct = $(By.xpath("//button[contains(@class, 'buy-button')]"));
    SelenideElement firstTitleProduct = $(By.xpath("//span[contains(@class, 'goods-tile__title')]"));
    SelenideElement checkCounterBtn = $(By.xpath("//span[contains(@class,'counter counter--green')]"));
    SelenideElement clickCartBtn = $(By.xpath("//span[contains(@class,'counter counter--green')]"));


    public SearchPage addProduct() {
        clickAddProduct.click();
        return this;
    }

    public String titleOfFirstProduct() {
        return firstTitleProduct.text().trim();
    }

    public String cartCounterBtn() {
        return Objects.requireNonNull(checkCounterBtn.attr("innerText")).trim();
    }

    public CartPage openCart() {
        clickCartBtn.click();
        return page(CartPage.class);
    }
}
