package tools_qa.locators;

import org.openqa.selenium.By;

public enum ButtonsPageLocators {

    // buttons
    DOUBLE_CLICK_BUTTON(By.id("doubleClickBtn")),
    RIGHT_CLICK_BUTTON(By.id("rightClickBtn")),
    CLICK_ME_BUTTON(By.xpath("//button[text()='Click Me']")),

    // alert_message
    DOUBLE_CLICK_MESSAGE(By.id("doubleClickMessage")),
    RIGHT_CLICK_MESSAGE(By.id("rightClickMessage")),
    CLICK_ME_MESSAGE(By.id("dynamicClickMessage"));

    private final By path;
    ButtonsPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
