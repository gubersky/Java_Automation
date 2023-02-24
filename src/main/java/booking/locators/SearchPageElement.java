package booking.locators;

import org.openqa.selenium.By;

public enum SearchPageElement {

    GET_CITY_HOTEL(By.xpath("//span [contains(@data-testid, 'address')]")),
    GET_CURRENCY(By.xpath("//span [@class='fcab3ed991 bd73d13072']")),
    GET_START_DATE(By.xpath("//button [contains(@data-testid, 'date-display-field-start')]")),
    GET_END_DATE(By.xpath("//button [contains(@data-testid, 'date-display-field-end')]"));

    private final By path;

    SearchPageElement(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;

    }
}
