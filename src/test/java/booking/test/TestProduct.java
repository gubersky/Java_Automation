package booking.test;

import booking.config.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static booking.locators.DateElement.*;
import static booking.locators.MainPageElement.*;

public class TestProduct extends TestBase {

    @Test(priority = 1)
    public void firstTest() {

        mainPage.clickOnLanguageButton().selectLanguage(SELECT_LANGUAGE_ENGLISH_BR.getXpath())
                .inputValueSearchField("New York")
                .openDatePicker();
        while (true) {
            String checkDate = mainPage.getMonthFromDate();
            if (checkDate.contains("December 2022")) {
                break;
            } else {
                mainPage.clickLeftArrow();
            }
        }

        mainPage.pickStartDate(PICK_DATE_2022_12_01.getXpath()).pickEndDate(PICK_DATE_2022_12_30.getXpath())
                .clickSearchButton();

        List<WebElement> checkCity = searchPage.getCityFromHotel();
        for (WebElement element : checkCity) {
            String textCity = element.getAttribute("outerText");
            Assert.assertTrue(textCity.contains("New York"));
        }

        softAssert.assertTrue(searchPage.getStartDate().contains("1 December 2022"));
        softAssert.assertTrue(searchPage.getEndDate().contains("30 December 2022"));
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void secondTest() {
        mainPage.clickOnCurrencyButton().selectCurrency(SELECT_CURRENCY_EUR.getXpath())
                .inputValueSearchField("Milan")
                .openDatePicker()
                .pickStartDate(PICK_DATE_2022_09_01.getXpath())
                .pickEndDate(PICK_DATE_2022_09_10.getXpath())
                .clickSearchButton();

        List<WebElement> checkEurCurrency = searchPage.getPriceFromHotel();
        for (WebElement element : checkEurCurrency) {
            String currency = element.getAttribute("outerText");
            Assert.assertTrue(currency.contains("€"));
        }

        searchPage.clickOnCurrencyButton().selectCurrency(SELECT_CURRENCY_USD.getXpath());

        List<WebElement> checkDollarCurrency = searchPage.getPriceFromHotel();
        for (WebElement element : checkDollarCurrency) {
            String currency = element.getAttribute("outerText");
            Assert.assertTrue(currency.contains("$"));
        }

        searchPage.clickOnCurrencyButton().selectCurrency(SELECT_CURRENCY_UAH.getXpath());

        List<WebElement> checkUahCurrency = searchPage.getPriceFromHotel();
        for (WebElement element : checkUahCurrency) {
            String currency = element.getAttribute("outerText");
            Assert.assertTrue(currency.contains("UAH"));
        }
    }
}
