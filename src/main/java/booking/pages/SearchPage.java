package booking.pages;

import booking.locators.MainPageElement;
import booking.locators.SearchPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage implements booking.behavior.SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public List<WebElement> getCityFromHotel() {
        return driver.findElements(SearchPageElement.GET_CITY_HOTEL.getXpath());

    }

    @Override
    public List<WebElement> getPriceFromHotel() {
        return driver.findElements(SearchPageElement.GET_CURRENCY.getXpath());
    }

    @Override
    public String getStartDate() {
        return driver.findElement(SearchPageElement.GET_START_DATE.getXpath())
                .getAttribute("textContent");
    }

    @Override
    public String getEndDate() {
        return driver.findElement(SearchPageElement.GET_END_DATE.getXpath())
                .getAttribute("textContent");
    }

    @Override
    public SearchPage clickOnCurrencyButton() {
        driver.findElement(MainPageElement.CURRENCY_BUTTON.getXpath()).click();
        return this;
    }

    @Override
    public SearchPage selectCurrency(By element) {
        driver.findElement(element).click();
        return this;
    }
}
