package eldorado.pages;

import eldorado.behavior.GeneralBehavior;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static eldorado.locators.SearchPageElement.*;

public class SearchPage extends GeneralBehavior implements eldorado.behavior.SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public SearchPage addProductToCart() {
        return null;
    }

    @Override
    public ProductPage openProductInfo(int numberOfElement) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_TOP.getXpath()));
        driver.findElements(OPEN_PRODUCT_INFO.getXpath()).get(numberOfElement).click();
        return new ProductPage (driver,wait);
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
        return new SelectionPage(driver,wait);

    }
}
