package gmail.locators;

import org.openqa.selenium.By;

public enum MainPageLocators {

    LOGIN_BUTTON(By.xpath("//a[contains(@class, 'button--mobile-before')]"));

    private final By path;

    MainPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
