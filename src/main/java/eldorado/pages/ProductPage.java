package eldorado.pages;


import eldorado.behavior.GeneralBehavior;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static eldorado.locators.ProductPageElement.*;

public class ProductPage extends GeneralBehavior implements eldorado.behavior.ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public ProductPage clickBuyProduct() {
        driver.findElement(BUY_BUTTON.getXpath()).click();
        return this;
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
        //actions.moveToElement((WebElement) element);
    }

    @Override
    public SelectionPage click(By element) {
        return new SelectionPage(driver,wait);

    }

    @Override
    public String getTitleOfProductNumber(By element) {
       String text = driver.findElement(element).getAttribute("innerText");
        return text;
    }

    @Override
    public int counterCart() {
        int count = Integer.parseInt(driver.findElement(COUNTER_CART.getXpath()).getText());
        return count;
    }
}
