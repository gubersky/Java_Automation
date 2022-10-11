package eldorado.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum MainPageElement {

    MAIN_LOGO("//img [@alt='eldorado.ua']"),
    SEARCH_FIELD("//input [@type='search']"),
    PROMOTIONAL_OFFERS("//img [@alt='promo']"),
    DELETE_SEARCH_BUTTON("//i [@class='icon-search']"),
    FIND_SEARCH_BUTTON("//img [@alt='search-button']"),
    BUY_BUTTON("//div [@class='icon-cart buy-button sp valign-wrapper']"),
    GO_TO_CART("//button [@class='basket-button']"),
    MENU_BUTTON(".menu-button"),
    CATALOG_OF_GOODS_SMARTPHONES_AND_PHONES("(//span [@class='category-icon'])[1]");


    private final String path;

    MainPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return  By.xpath(path);
    }

    public By getCss() {
        return By.cssSelector(path);
    }
}
