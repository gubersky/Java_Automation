package booking.locators;

import org.openqa.selenium.By;

public enum MainPageElement {

    LANGUAGE_BUTTON("//button [contains(@data-modal-id, 'language-selection')]"),
    CURRENCY_BUTTON(" //button [contains(@data-modal-header-async-type, 'currencyDesktop')]"),
    SELECT_CURRENCY_EUR("//div [@class='bui-traveller-header__currency' and contains (text(), 'EUR')]"),
    SELECT_CURRENCY_UAH("//div [@class='bui-traveller-header__currency' and contains (text(), 'UAH')]"),
    SELECT_CURRENCY_USD("//div [@class='bui-traveller-header__currency' and contains (text(), 'USD')]"),
    SELECT_LANGUAGE_ENGLISH_BR("//a [contains(@data-lang, 'en-gb')]"),
    SEARCH_FIELD("//input[contains(@id, 'ss')]"),
    SEARCH_BUTTON("//span [contains(@class, 'js-sb-submit-text ')]");

    private final String xpath;

    MainPageElement(String xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return By.xpath(xpath);

    }
}
