package gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage implements gmail.behavior.AccountPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public AccountPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public Boolean elementIsDisplayed(By element) {
        return driver.findElement(element).isDisplayed();
    }

    @Override
    public String getText(By element) {
        return driver.findElement(element).getAttribute("ariaLabel");
    }
}
