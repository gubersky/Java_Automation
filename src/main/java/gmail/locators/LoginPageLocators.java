package gmail.locators;

import org.openqa.selenium.By;

public enum LoginPageLocators {

    LOGIN_SCREEN("//div [@class='rhhJr']"),
    LOGIN_FIELD("#identifierId"),
    ACCOUNT_ALERT("//div[@class='o6cuMc']"),
    PASSWORD_FIELD("#password"),
    PASSWORD_ALERT("//div [@class='OyEIQ uSvLId']"),
    NEXT_BUTTON("#identifierNext");

    private final String path;

    LoginPageLocators(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }

    public By getCss() {
        return By.cssSelector(path);
    }
}
