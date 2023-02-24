package tools_qa.locators;

import org.openqa.selenium.By;

public enum CheckBoxPageLocators {

    EXPAND_ALL_BUTTON(By.cssSelector("button[title='Expand all']")),
    LIST_OF_NAME_BOX(By.cssSelector("span[class='rct-title']")),
    TEXT_ALERT(By.cssSelector("span[class='text-success']")),
    ITEM_CHECK(By.cssSelector("svg[class='rct-icon rct-icon-check']"));

    private final By path;

    CheckBoxPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }

}
