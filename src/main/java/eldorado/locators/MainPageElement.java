package eldorado.locators;

import org.openqa.selenium.By;

public enum MainPageElement {

    MAIN_LOGO(By.xpath("//img [@alt='eldorado.ua']")),
    SEARCH_FIELD(By.xpath("//input [@type='search']")),
    FIND_SEARCH_BUTTON(By.xpath("//img [@alt='search-button']"));

    private final By path;

    MainPageElement(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
