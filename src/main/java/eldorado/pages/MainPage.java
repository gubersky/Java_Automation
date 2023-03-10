package eldorado.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static eldorado.locators.MainPageElement.*;


public class MainPage extends BasePage implements eldorado.contract.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage inputSearchValue(String value) {
        driver.findElement(SEARCH_FIELD.getLocator()).sendKeys(value);
        return this;
    }


    @Override
    public SearchPage clickSearchButton() {
        driver.findElement(FIND_SEARCH_BUTTON.getLocator()).click();
        return new SearchPage(driver, wait);
    }

}
