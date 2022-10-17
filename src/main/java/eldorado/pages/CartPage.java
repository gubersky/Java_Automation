package eldorado.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static eldorado.locators.CartPageElement.DELETE_PRODUCT_BUTTON;

public class CartPage implements eldorado.behavior.CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage deleteProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(DELETE_PRODUCT_BUTTON.getXpath()));
        driver.findElement(DELETE_PRODUCT_BUTTON.getXpath()).click();
        return new MainPage(driver,wait);
    }
}
