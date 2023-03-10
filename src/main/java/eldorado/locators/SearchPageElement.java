package eldorado.locators;

import org.openqa.selenium.By;


public enum SearchPageElement {


    OPEN_PRODUCT_INFO(By.xpath("//div [@class='goods-item-content']")),
    SEARCH_TOP(By.xpath("//div [@class='search-top']"));


    private final By path;

    SearchPageElement(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
