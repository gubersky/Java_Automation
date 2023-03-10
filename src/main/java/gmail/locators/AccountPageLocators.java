package gmail.locators;

import org.openqa.selenium.By;

public enum AccountPageLocators {

    USER_LOGO(By.xpath("//a[@class='gb_A gb_La gb_f']"));

    private final By path;

    AccountPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
