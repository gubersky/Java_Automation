package tools_qa.pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools_qa.generator.Generator;
import static tools_qa.locators.WebTablesPageLocators.*;
import tools_qa.pages.BasePage;
import java.util.ArrayList;
import java.util.List;

public class WebTablesPage extends BasePage implements tools_qa.contract.elements_page.WebTablesPage {
    Generator personInfo = new Generator();
    String firstName;
    String lastName;
    String email;
    String age;
    String salary;
    String department;

    public WebTablesPage(WebDriver driver, String url) {
        super(driver, url);
    }
    @Override
    public List<String> addNewPerson() {
         firstName = personInfo.generatePerson("firstName");
         lastName = personInfo.generatePerson("lastName");
         email = personInfo.generatePerson("email");
         age = personInfo.generatePerson("age");
         salary = personInfo.generatePerson("salary");
         department = personInfo.generatePerson("department");

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
    @Override
    public List<List<String>> checkAddPerson() {
        List<WebElement> personList = elementsArePresent(ADD_PERSON_LIST.getLocator());
        List<List<String>> data = new ArrayList<>();
        for (WebElement element : personList) {
            data.add(List.of(element.getText().split("\n")));
        }
        return data;
    }
    @Override
    public void searchSomePerson(String keyWord) {
        goToElement(elementIsVisible(SEARCH_FIELD.getLocator()));
        elementIsVisible(SEARCH_FIELD.getLocator()).sendKeys(keyWord);

    }
    @Override
    public List<String> checkSearchPerson() {
        WebElement deleteButton = elementIsPresent(DELETE_BUTTON.getLocator())
                .findElement(By.xpath(".//ancestor::div[@class='rt-tr-group']"));
        return List.of(deleteButton.getText().split("\n"));
    }
    @Override
    public String editPersonInfo() {
        firstName = personInfo.generatePerson("firstName");
        lastName = personInfo.generatePerson("lastName");
        email = personInfo.generatePerson("email");
        age = personInfo.generatePerson("age");
        salary = personInfo.generatePerson("salary");
        department = personInfo.generatePerson("department");
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
    @Override
    public void deletePerson() {
        elementIsPresent(DELETE_BUTTON.getLocator()).click();
    }
    @Override
    public String checkDeletePerson() {
        return elementIsPresent(ALERT_NO_ROWS_FOUND.getLocator()).getText();
    }
    @Override
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
    @Override
    public int countRows() {
        List<WebElement> list_rows = elementsArePresent(ADD_PERSON_LIST.getLocator());
        return list_rows.size();
    }
}
