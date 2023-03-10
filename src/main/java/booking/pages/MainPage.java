package booking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static booking.locators.DateElement.*;
import static booking.locators.MainPageElement.*;

import java.util.List;

public class MainPage implements booking.contract.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage clickOnLanguageButton() {
        driver.findElement(LANGUAGE_BUTTON.getLocator()).click();
        return this;
    }

    @Override
    public MainPage selectLanguage(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Override
    public MainPage inputValueSearchField(String city) {
        driver.findElement(SEARCH_FIELD.getLocator()).sendKeys(city);
        return this;
    }

    @Override
    public MainPage openDatePicker() {
        driver.findElement(DATE_PICKER_BUTTON.getLocator()).click();
        return this;
    }

    @Override
    public MainPage clickLeftArrow() {
        driver.findElement(DATE_PICKER_LEFT_ARROW.getLocator()).click();
        return this;
    }

    @Override
    public MainPage pickStartDate(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Override
    public MainPage pickEndDate(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Override
    public String getMonthFromDate() {
        List<WebElement> date = driver.findElements(GET_MONTH_DATE.getLocator());
        for (WebElement element : date) {
            return element.getAttribute("outerText");
        }
        return null;
    }

    @Override
    public MainPage clickOnCurrencyButton() {
        driver.findElement(CURRENCY_BUTTON.getLocator()).click();
        return this;
    }

    @Override
    public MainPage selectCurrency(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Override
    public SearchPage clickSearchButton() {
        driver.findElement(SEARCH_BUTTON.getLocator()).click();
        return new SearchPage(driver, wait);
    }
}
