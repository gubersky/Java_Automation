package eldorado.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static eldorado.locators.MainPageElement.*;


public class MainPage extends BasePage implements eldorado.behavior.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage inputSearchValue(String value) {
        driver.findElement(SEARCH_FIELD.getXpath()).sendKeys(value);
        return this;
    }

    @Override
    public MainPage deleteSearchValue() {
        driver.findElement(DELETE_SEARCH_BUTTON.getXpath()).click();
        return this;
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
