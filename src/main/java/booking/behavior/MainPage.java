package booking.behavior;

import org.openqa.selenium.By;

public interface MainPage {

    MainPage clickOnLanguageButton();

    MainPage selectLanguage(By element);

    MainPage inputValueSearchField(String city);

    MainPage openDatePicker();

    MainPage clickLeftArrow();

    MainPage pickStartDate(By element);

    MainPage pickEndDate(By element);

    String getMonthFromDate();

    MainPage clickOnCurrencyButton();

    MainPage selectCurrency(By element);

    SearchPage clickSearchButton();

}
