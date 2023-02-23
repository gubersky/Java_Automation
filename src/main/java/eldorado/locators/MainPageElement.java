package eldorado.locators;

import org.openqa.selenium.By;

public enum MainPageElement {

    MAIN_LOGO("//img [@alt='eldorado.ua']"),
    SEARCH_FIELD("//input [@type='search']"),
    FIND_SEARCH_BUTTON("//img [@alt='search-button']");

    private final String path;

    MainPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }

    }
