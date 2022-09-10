package eldorado.webelement;

import org.openqa.selenium.By;

public enum MainPageElement {

    MAIN_LOGO("//img [@alt='eldorado.ua']"),
    SEARCH_FIELD("//input [@type='search']"),
    PROMOTIONAL_OFFERS("//img [@alt='promo']"),
    DELETE_SEARCH_BUTTON("//i [@class='icon-search']"),
    FIND_SEARCH_BUTTON("//img [@alt='search-button']");


    private final String xpath;

    MainPageElement(String xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return By.xpath(xpath);

    }
}
