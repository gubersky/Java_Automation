package gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage implements gmail.contract.LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public LoginPage inputValue(By element, String value) {
        driver.findElement(element).sendKeys(value);
        return this;
    }

    @Override
    public Boolean elementIsDisplayed(By element) {
        return driver.findElement(element).isDisplayed();
    }

    @Override
    public String getText(By element) {
       return driver.findElement(element).getAttribute("outerText");
    }

    @Override
    public LoginPage clickElement(By element) {
        driver.findElement(element).click();
        return this;
    }
}
