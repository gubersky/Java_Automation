package eldorado.webelement;

import org.openqa.selenium.By;


public enum SearchPageElement {


    OPEN_PRODUCT_INFO("//div [@class='goods-item-content']"),
    SEARCH_TOP("//div [@class='search-top']");


    private final String path;

    SearchPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }

    public By getCss() {
        return By.cssSelector(path);
    }
}
