package booking.pages;

import booking.locators.DateElement;
import booking.locators.MainPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage implements booking.behavior.MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage clickOnLanguageButton() {
        driver.findElement(MainPageElement.LANGUAGE_BUTTON.getXpath()).click();
        return this;
    }

    @Override
    public MainPage selectLanguage(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Override
    public MainPage inputValueSearchField(String city) {
        driver.findElement(MainPageElement.SEARCH_FIELD.getXpath()).sendKeys(city);
        return this;
    }

    @Override
    public MainPage openDatePicker() {
        driver.findElement(DateElement.DATE_PICKER_BUTTON.getXpath()).click();
        return this;
    }

    @Override
    public MainPage clickLeftArrow() {
        driver.findElement(DateElement.DATE_PICKER_LEFT_ARROW.getXpath()).click();
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
        List<WebElement> date = driver.findElements(DateElement.GET_MONTH_DATE.getXpath());
        for (WebElement element : date) {
            return element.getAttribute("outerText");
        }
        return null;
    }

    @Override
    public MainPage clickOnCurrencyButton() {
        driver.findElement(MainPageElement.CURRENCY_BUTTON.getXpath()).click();
        return this;
    }

    @Override
    public MainPage selectCurrency(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Override
    public SearchPage clickSearchButton() {
        driver.findElement(MainPageElement.SEARCH_BUTTON.getXpath()).click();
        return new SearchPage(driver, wait);
    }
}
