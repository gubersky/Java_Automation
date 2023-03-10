package gmail.locators;

import org.openqa.selenium.By;

public enum LoginPageLocators {

    LOGIN_SCREEN(By.xpath("//div [@class='rhhJr']")),
    LOGIN_FIELD(By.cssSelector("#identifierId")),
    ACCOUNT_ALERT(By.xpath("//div[@class='o6cuMc']")),
    PASSWORD_FIELD(By.cssSelector("#password")),
    PASSWORD_ALERT(By.xpath("//div [@class='OyEIQ uSvLId']")),
    NEXT_BUTTON(By.cssSelector("#identifierNext"));

    private final By path;

    LoginPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }

}
