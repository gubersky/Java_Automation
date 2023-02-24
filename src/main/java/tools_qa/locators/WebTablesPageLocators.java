package tools_qa.locators;

import org.openqa.selenium.By;

public enum WebTablesPageLocators {
    // form_fields
    FIRST_NAME(By.cssSelector("input[id='firstName']")),
    LAST_NAME(By.cssSelector("input[id='lastName']")),
    EMAIL(By.cssSelector("input[id='userEmail']")),
    AGE(By.cssSelector("input[id='age']")),
    SALARY(By.cssSelector("input[id='salary']")),
    DEPARTMENT(By.cssSelector("input[id='department']")),

    // buttons
    ADD_BUTTON(By.id("addNewRecordButton")),
    SUBMIT_BUTTON(By.cssSelector("button[type='submit']")),
    EDIT_BUTTON(By.xpath("//span[@title='Edit']")),
    DELETE_BUTTON(By.cssSelector("span[title='Delete']")),

    // table_person
    SEARCH_FIELD(By.cssSelector("#searchBox")),
    ADD_PERSON_LIST(By.cssSelector("div[class='rt-tr-group']")),
    //ROW = ".//ancestor::div[@class='rt-tr-group']"
    ALERT_NO_ROWS_FOUND(By.cssSelector("div[class='rt-noData']")),
    SELECT_ROWS(By.cssSelector("select[aria-label='rows per page']"));


    private final By path;

    WebTablesPageLocators(By path) {
        this.path = path;
    }

    public By getLocator() {
        return path;
    }
}
