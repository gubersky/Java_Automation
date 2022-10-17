package booking.tests;

import booking.config.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static booking.locators.DateElement.*;
import static booking.locators.MainPageElement.*;

public class FirstTest extends TestBase {

    @Test(priority = 1)
    public void test() {

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
}
