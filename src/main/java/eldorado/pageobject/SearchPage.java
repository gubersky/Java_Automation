package eldorado.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static eldorado.webelement.SearchPageElement.*;

public class SearchPage implements eldorado.behavior.SearchPage {

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

}
