package eldorado.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static eldorado.locators.SearchPageElement.*;

public class SearchPage extends BasePage implements eldorado.contract.SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
    }


    @Override
    public ProductPage openProductInfo(int numberOfElement) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_TOP.getLocator()));
        driver.findElements(OPEN_PRODUCT_INFO.getLocator()).get(numberOfElement).click();
        return new ProductPage(driver, wait);
    }
}
