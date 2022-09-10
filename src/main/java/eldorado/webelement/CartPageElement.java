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

}
