package tools_qa.pages.elements_page;

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
        for (WebElement element: personList) {
            data.add(List.of(element.getText().split("\n")));
        }
        return data;
    }

    public void searchSomePerson(String keyWord) {
        elementIsVisible(SEARCH_FIELD.getLocator()).sendKeys(keyWord);

    }
}
