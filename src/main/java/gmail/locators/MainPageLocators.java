package gmail.locators;

import org.openqa.selenium.By;

public enum MainPageLocators {

    LOGIN_BUTTON("//a[contains(@class, 'button--mobile-before')]");

    private final String path;

    MainPageLocators(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }
}
