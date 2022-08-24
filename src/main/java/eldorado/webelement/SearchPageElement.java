package eldorado.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum SearchPageElement {


    OPEN_PRODUCT_INFO("//div [@class='goods-item-content']"),
    SEARCH_TOP("//div [@class='search-top']");


    private final String xpath;

    SearchPageElement(String xpath) {
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
