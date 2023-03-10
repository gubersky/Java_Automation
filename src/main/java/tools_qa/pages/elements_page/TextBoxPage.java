package tools_qa.pages.elements_page;

import org.openqa.selenium.WebDriver;
import tools_qa.generator.Generator;

import static tools_qa.locators.TextBoxPageLocators.*;

import tools_qa.pages.BasePage;

public class TextBoxPage extends BasePage implements tools_qa.contract.elements_page.TextBoxPage {
    Generator personInfo = new Generator();
    String fullName;
    String email;
    String currentAddress;
    String permanentAddress;

    public TextBoxPage(WebDriver driver, String url) {
        super(driver, url);
    }

    @Override
    public String[] fillAllField() {
        fullName = personInfo.generatePerson("fullName");
        email = personInfo.generatePerson("email");
        currentAddress = personInfo.generatePerson("currentAddress");
        permanentAddress = personInfo.generatePerson("permanentAddress");

        elementIsVisible(FULL_NAME.getLocator()).sendKeys(fullName);
        elementIsVisible(EMAIL.getLocator()).sendKeys(email);
        elementIsVisible(CURRENT_ADDRESS.getLocator()).sendKeys(currentAddress);
        elementIsVisible(PERMANENT_ADDRESS.getLocator()).sendKeys(permanentAddress);
        elementIsVisible(SUBMIT.getLocator()).click();

        return new String[]{fullName, email, currentAddress, permanentAddress};
    }

    @Override
    public String[] checkFieldForm() {
        String fullName = elementIsPresent(CREATED_FULL_NAME.getLocator()).getText().split(":")[1];
        String email = elementIsPresent(CREATED_EMAIL.getLocator()).getText().split(":")[1];
        String currentAddress = elementIsPresent(CREATED_CURRENT_ADDRESS.getLocator()).getText().split(":")[1];
        String permanentAddress = elementIsPresent(CREATED_PERMANENT_ADDRESS.getLocator()).getText().split(":")[1];

        return new String[]{fullName, email, currentAddress, permanentAddress};
    }
}
