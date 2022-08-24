package booking.test;


import booking.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static booking.webelement.DateElement.*;
import static booking.webelement.MainPageElement.*;

public class SecondTest extends TestBase {

    @Test(priority = 1)
    public void test() {
        mainPage.clickOnCurrencyButton().selectCurrency(SELECT_CURRENCY_EUR.getXpath())
                .inputValueSearchField("Milan")
                .openDatePicker()
                .pickStartDate(PICK_DATE_2022_08_01.getXpath())
                .pickEndDate(PICK_DATE_2022_08_10.getXpath())
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
