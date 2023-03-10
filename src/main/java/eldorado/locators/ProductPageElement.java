package eldorado.locators;

import org.openqa.selenium.By;

public enum ProductPageElement {


    BUY_BUTTON(By.xpath("//div [@class='buy-button sp valign-wrapper']")),
    COUNTER_CART(By.xpath("//div [@class='counter counter-cart active']")),
    TITLE_OF_PRODUCT(By.xpath("//div [@class='product-name']")),
    TITLE_OF_PRODUCT_POPUP_CART(By.xpath("//div [@class='product-title sp']")),
    CART_POPUP(By.xpath("//div [@class='order-cart']"));


    private final By path;

    ProductPageElement(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
