package eldorado.pages;

import eldorado.behavior.GeneralBehavior;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static eldorado.locators.MainPageElement.*;


public class MainPage extends GeneralBehavior implements eldorado.behavior.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public boolean elementIsDisplayed(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element).isDisplayed();
    }

    @Override
    public List getWebElements(By element) {
        return driver.findElements(element);
    }

    @Override
    public String getStringFromList(By element) {
        return null;
    }

    @Override
    public void moveToElement(By element) {
        Actions actions = new Actions(driver);
        WebElement saveElement = driver.findElement(element);
        actions.moveToElement(saveElement).build().perform();
    }

    @Override
    public SelectionPage click(By element) {
        driver.findElement(element).click();
        return new SelectionPage(driver,wait);
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
        return new SearchPage(driver, wait);
    }

    @Override
    public CartPage goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(GO_TO_CART.getXpath()));
        driver.findElement(GO_TO_CART.getXpath()).click();
        return new CartPage(driver, wait);
    }

    @Override
    public MainPage clickBuyProduct() {
        driver.findElement(BUY_BUTTON.getXpath()).click();
        return this;
    }
}
