package booking.webelement;

import org.openqa.selenium.By;

public enum DateElement {


    DATE_PICKER_BUTTON("//span[contains(@class, 'sb-date-field__icon')]"),
    DATE_PICKER_LEFT_ARROW("//div [contains(@data-bui-ref,  'calendar-next')]"),
    PICK_DATE_2022_09_01("//td [contains(@data-date, '2022-09-01')]"),
    PICK_DATE_2022_09_10("//td [contains(@data-date, '2022-09-10')]"),
    PICK_DATE_2022_12_01("//td [contains(@data-date, '2022-12-01')]"),
    PICK_DATE_2022_12_30("//td [contains(@data-date, '2022-12-30')]"),
    GET_MONTH_DATE("//div [@class=\"bui-calendar__month\"]");


    private final String xpath;

    DateElement(String xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return By.xpath(xpath);

    }
}
