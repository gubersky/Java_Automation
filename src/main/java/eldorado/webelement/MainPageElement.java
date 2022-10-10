package eldorado.webelement;

import org.openqa.selenium.By;

public enum MainPageElement {

    MAIN_LOGO("//img [@alt='eldorado.ua']"),
    SEARCH_FIELD("//input [@type='search']"),
    PROMOTIONAL_OFFERS("//img [@alt='promo']"),
    DELETE_SEARCH_BUTTON("//i [@class='icon-search']"),
    FIND_SEARCH_BUTTON("//img [@alt='search-button']"),
    BUY_BUTTON("//div [@class='icon-cart buy-button sp valign-wrapper']"),
    GO_TO_CART("//button [@class='basket-button']"),
    CATALOG_OF_GOODS_SMARTPHONES_AND_PHONES("//div [@class='menu-mobile valign-wrapper']");


    private final String path;

    MainPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);

    }
    public By getCss(){
        return By.cssSelector(path);
    }
}
