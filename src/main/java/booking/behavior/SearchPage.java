package booking.behavior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface SearchPage {

    List<WebElement> getCityFromHotel();

    List<WebElement> getPriceFromHotel();

    String getStartDate();

    String getEndDate();

    SearchPage clickOnCurrencyButton();

    SearchPage selectCurrency(By element);
}
