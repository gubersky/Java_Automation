package tools_qa.locators;

import org.openqa.selenium.By;

public enum TextBoxPageLocators {
    //form_fields
    FULL_NAME(By.cssSelector("#userName")),
    EMAIL(By.xpath("//input[@type='email']")),
    CURRENT_ADDRESS(By.id("currentAddress")),
    PERMANENT_ADDRESS(By.cssSelector("#permanentAddress")),
    SUBMIT(By.cssSelector("button[id='submit']")),

    //created_form
    CREATED_FULL_NAME(By.cssSelector("#output #name")),
    CREATED_EMAIL(By.cssSelector("p[id='email']")),
    CREATED_CURRENT_ADDRESS(By.cssSelector("p[id='currentAddress']")),
    CREATED_PERMANENT_ADDRESS(By.cssSelector("p[id='permanentAddress']"));

    private final By path;

    TextBoxPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
