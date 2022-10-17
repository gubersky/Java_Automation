package eldorado.locators;

import org.openqa.selenium.By;

public enum CartPageElement {

    CART_POPUP(" //div [@class='order-cart']"),
    DELETE_PRODUCT_BUTTON("//div [@class='icon-trash']"),
    NOTIFICATION_WRAPPER("//div [@class='notifications-wrapper']");

    private final String path;

    CartPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }

    public By getCss(){
        return By.cssSelector(path);
    }

}
