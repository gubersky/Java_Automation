package booking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static booking.locators.MainPageElement.*;
import static booking.locators.SearchPageElement.*;

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
        return driver.findElements(GET_CITY_HOTEL.getLocator());

    }

    @Override
    public List<WebElement> getPriceFromHotel() {
        return driver.findElements(GET_CURRENCY.getLocator());
    }

    @Override
    public String getStartDate() {
        return driver.findElement(GET_START_DATE.getLocator())
                .getAttribute("textContent");
    }

    @Override
    public String getEndDate() {
        return driver.findElement(GET_END_DATE.getLocator())
                .getAttribute("textContent");
    }

    @Override
    public SearchPage clickOnCurrencyButton() {
        driver.findElement(CURRENCY_BUTTON.getLocator()).click();
        return this;
    }

    @Override
    public SearchPage selectCurrency(By element) {
        driver.findElement(element).click();
        return this;
    }
}
