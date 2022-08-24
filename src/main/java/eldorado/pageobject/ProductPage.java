package eldorado.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static eldorado.webelement.ProductPageElement.*;

public class ProductPage implements eldorado.behavior.ProductPage {

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
    public ProductPage elementIsDisplayed(By element) {
        driver.findElement(element).isDisplayed();
        return this;
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
