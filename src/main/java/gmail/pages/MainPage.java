package gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class MainPage implements gmail.behavior.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public LoginPage openLogin() {
        driver.findElement(LOGIN_BUTTON.getXpath()).click();
        return new LoginPage(driver, wait);
    }

    @Override
    public Boolean elementIsDisplayed(By element) {
        return driver.findElement(element).isDisplayed();
    }
}
