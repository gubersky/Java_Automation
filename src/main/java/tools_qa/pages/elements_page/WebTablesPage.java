package tools_qa.pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools_qa.generator.Generator;
import static tools_qa.locators.WebTablesPageLocators.*;
import tools_qa.pages.BasePage;
import java.util.ArrayList;
import java.util.List;

public class WebTablesPage extends BasePage {

    public WebTablesPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public List<String> addNewPerson() {
        Generator personInfo = new Generator();
        String firstName = personInfo.generatePerson("firstName");
        String lastName = personInfo.generatePerson("lastName");
        String email = personInfo.generatePerson("email");
        String age = personInfo.generatePerson("age");
        String salary = personInfo.generatePerson("salary");
        String department = personInfo.generatePerson("department");

        elementIsVisible(ADD_BUTTON.getLocator()).click();
        elementIsVisible(FIRST_NAME.getLocator()).sendKeys(firstName);
        elementIsVisible(LAST_NAME.getLocator()).sendKeys(lastName);
        elementIsVisible(EMAIL.getLocator()).sendKeys(email);
        elementIsVisible(AGE.getLocator()).sendKeys(age);
        elementIsVisible(SALARY.getLocator()).sendKeys(salary);
        elementIsVisible(DEPARTMENT.getLocator()).sendKeys(department);
        elementIsVisible(SUBMIT_BUTTON.getLocator()).click();

        return List.of(firstName, lastName, age, email, salary, department);
    }

    public List<List<String>> checkAddPerson() {
        List<WebElement> personList = elementsArePresent(ADD_PERSON_LIST.getLocator());
        List<List<String>> data = new ArrayList<>();
        for (WebElement element : personList) {
            data.add(List.of(element.getText().split("\n")));
        }
        return data;
    }

    public void searchSomePerson(String keyWord) {
        goToElement(elementIsVisible(SEARCH_FIELD.getLocator()));
        elementIsVisible(SEARCH_FIELD.getLocator()).sendKeys(keyWord);

    }

    public List<String> checkSearchPerson() {
        WebElement deleteButton = elementIsPresent(DELETE_BUTTON.getLocator())
                .findElement(By.xpath(".//ancestor::div[@class='rt-tr-group']"));
        return List.of(deleteButton.getText().split("\n"));
    }

    public String editPersonInfo() {
        Generator personInfo = new Generator();
        String firstName = personInfo.generatePerson("firstName");
        String lastName = personInfo.generatePerson("lastName");
        String email = personInfo.generatePerson("email");
        String age = personInfo.generatePerson("age");
        String salary = personInfo.generatePerson("salary");
        String department = personInfo.generatePerson("department");
        String[] listInfo = {firstName, lastName, email, age, salary, department};
        By[] listLocators = {FIRST_NAME.getLocator(), LAST_NAME.getLocator(), EMAIL.getLocator(),
                AGE.getLocator(), SALARY.getLocator(), DEPARTMENT.getLocator()};
        int chooseField = (int) (Math.random() * 5);
        elementIsVisible(EDIT_BUTTON.getLocator()).click();
        elementIsVisible(listLocators[chooseField]).clear();
        elementIsVisible(listLocators[chooseField]).sendKeys(listInfo[chooseField]);
        elementIsVisible(SUBMIT_BUTTON.getLocator()).click();
        return listInfo[chooseField];

    }

    public void deletePerson() {
        elementIsPresent(DELETE_BUTTON.getLocator()).click();
    }

    public String checkDeletePerson() {
        return elementIsPresent(ALERT_NO_ROWS_FOUND.getLocator()).getText();
    }

    public List<Integer> selectTableRow() {
        removeFooter();
        removeFixedBan();
        int[] count = {5, 10, 20, 25, 50, 100};
        List<Integer> data = new ArrayList<>();
        for (int i : count) {
            WebElement countButton = elementIsPresent(SELECT_ROWS.getLocator());
            goToElement(countButton);
            countButton.click();
            elementIsVisible(By.cssSelector(String.format("option[value='%d']",i))).click();
            data.add(countRows());
        }
        return data;

    }

    public int countRows() {
        List<WebElement> list_rows = elementsArePresent(ADD_PERSON_LIST.getLocator());
        return list_rows.size();
    }
}
