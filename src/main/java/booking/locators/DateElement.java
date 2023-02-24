package booking.locators;

import org.openqa.selenium.By;

public enum DateElement {


    DATE_PICKER_BUTTON(By.xpath("//span[contains(@class, 'sb-date-field__icon')]")),
    DATE_PICKER_LEFT_ARROW(By.xpath("//div [contains(@data-bui-ref,  'calendar-next')]")),
    PICK_DATE_2022_09_01(By.xpath("//td [contains(@data-date, '2022-09-01')]")),
    PICK_DATE_2022_09_10(By.xpath("//td [contains(@data-date, '2022-09-10')]")),
    PICK_DATE_2022_12_01(By.xpath("//td [contains(@data-date, '2022-12-01')]")),
    PICK_DATE_2022_12_30(By.xpath("//td [contains(@data-date, '2022-12-30')]")),
    GET_MONTH_DATE(By.xpath("//div [@class='bui-calendar__month']"));


    private final By path;

    DateElement(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;

    }
}
