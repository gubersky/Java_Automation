package eldorado.locators;

import org.openqa.selenium.By;

public enum SelectionPageElement {

    YDUD("");


    private final String path;

    SelectionPageElement(String path) {
        this.path = path;
    }

    public By getXpath() {
        return By.xpath(path);
    }

    public By getCss() {
        return By.cssSelector(path);
    }
}
