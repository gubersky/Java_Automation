package eldorado.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static eldorado.webelement.MainPageElement.*;

public class MainPage extends PageBehavior implements eldorado.behavior.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public boolean elementIsDisplayed(By element) {
       return driver.findElement(element).isDisplayed();
    }

    @Override
    public List getWebElements(By element) {
        return driver.findElements(element);
    }

    @Override
    public MainPage inputSearchValue(String value) {
        driver.findElement(SEARCH_FIELD.getXpath()).sendKeys(value);
        return this;
    }

    @Override
    public MainPage deleteSearchValue() {
        driver.findElement(DELETE_SEARCH_BUTTON.getXpath()).click();
        return null;
    }

    @Override
    public SearchPage clickSearchButton() {
        driver.findElement(FIND_SEARCH_BUTTON.getXpath()).click();
        return new SearchPage(driver,wait);
    }
}
