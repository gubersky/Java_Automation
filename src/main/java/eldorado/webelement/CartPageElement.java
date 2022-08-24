package eldorado.webelement;

import org.openqa.selenium.By;

public enum CartPageElement {

    CART_POPUP(" //div [@class='order-cart']");

    private final String xpath;

    CartPageElement(String xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return By.xpath(xpath);

    }

    public By getId() {
        return By.id(xpath);
    }

    public By getName() {
        return By.name(xpath);
    }
}
