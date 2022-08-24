package booking.webelement;

import org.openqa.selenium.By;

public enum SearchPageElement {

    GET_CITY_HOTEL("//span [contains(@data-testid, 'address')]"),
    GET_CURRENCY("//span [@class='fcab3ed991 bd73d13072']"),
    GET_START_DATE("//button [contains(@data-testid, 'date-display-field-start')]"),
    GET_END_DATE("//button [contains(@data-testid, 'date-display-field-end')]");

    private final String xpath;

    SearchPageElement(String xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return By.xpath(xpath);

    }
}
