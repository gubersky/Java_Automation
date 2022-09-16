package eldorado.webelement;

import org.openqa.selenium.By;

public enum CartPageElement {

    CART_POPUP(" //div [@class='order-cart']"),
    DELETE_PRODUCT_BUTTON("//div [@class='icon-trash']"),
    NOTIFICATION_WRAPPER("//div [@class='notifications-wrapper']");

    private final String xpath;

    CartPageElement(String xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return By.xpath(xpath);

    }

}
