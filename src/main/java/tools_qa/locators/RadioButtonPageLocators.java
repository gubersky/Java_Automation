package tools_qa.locators;

import org.openqa.selenium.By;

public enum RadioButtonPageLocators {

    YES_RADIOBUTTON(By.xpath("//label[@for='yesRadio']")),
    IMPRESSIVE_RADIOBUTTON(By.xpath("//label[@for='impressiveRadio']")),
    NO_RADIOBUTTON(By.xpath("//label[@for='noRadio']")),
    TEXT_ALERT(By.xpath("//span[@class='text-success']"));

    private final By path;

    RadioButtonPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
