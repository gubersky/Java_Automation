package booking.locators;

import org.openqa.selenium.By;

public enum MainPageElement {

    LANGUAGE_BUTTON(By.xpath("//button [contains(@data-modal-id, 'language-selection')]")),
    CURRENCY_BUTTON(By.xpath(" //button [contains(@data-modal-header-async-type, 'currencyDesktop')]")),
    SELECT_CURRENCY_EUR(By.xpath("//div [@class='bui-traveller-header__currency' and contains (text(), 'EUR')]")),
    SELECT_CURRENCY_UAH(By.xpath("//div [@class='bui-traveller-header__currency' and contains (text(), 'UAH')]")),
    SELECT_CURRENCY_USD(By.xpath("//div [@class='bui-traveller-header__currency' and contains (text(), 'USD')]")),
    SELECT_LANGUAGE_ENGLISH_BR(By.xpath("//a [contains(@data-lang, 'en-gb')]")),
    SEARCH_FIELD(By.xpath("//input[contains(@id, 'ss')]")),
    SEARCH_BUTTON(By.xpath("//span [contains(@class, 'js-sb-submit-text ')]"));

    private final By path;

    MainPageElement(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;

    }
}
