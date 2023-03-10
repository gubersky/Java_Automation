package eldorado.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static eldorado.locators.ProductPageElement.*;

public class ProductPage extends BasePage implements eldorado.contract.ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public ProductPage clickBuyProduct() {
        driver.findElement(BUY_BUTTON.getLocator()).click();
        return this;
    }

    @Override
    public String getTitleOfProductNumber(By element) {
        return driver.findElement(element).getAttribute("innerText");
    }

    @Override
    public int counterCart() {
        return Integer.parseInt(driver.findElement(COUNTER_CART.getLocator()).getText());
    }
}
