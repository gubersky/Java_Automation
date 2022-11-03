package gmail.locators;

import org.openqa.selenium.By;

public enum AccountPageLocators {

    USER_LOGO("//a[@class='gb_A gb_La gb_f']");

    private final String path;

    AccountPageLocators(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }
}
