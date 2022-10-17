package eldorado.locators;

import org.openqa.selenium.By;

public enum ProductPageElement {


    BUY_BUTTON("//div [@class='buy-button sp valign-wrapper']"),
    COUNTER_CART("//div [@class='counter counter-cart active']"),
    TITLE_OF_PRODUCT("//div [@class='product-name']"),
    TITLE_OF_PRODUCT_POPUP_CART("//div [@class='product-title sp']"),
    CART_POPUP(" //div [@class='order-cart']");


    private final String path;

    ProductPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }

    public By getCss() {
        return By.cssSelector(path);
    }
}
