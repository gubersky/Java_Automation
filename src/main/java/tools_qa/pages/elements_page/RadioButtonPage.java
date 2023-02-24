package tools_qa.pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tools_qa.pages.BasePage;

import static tools_qa.locators.RadioButtonPageLocators.*;

import java.util.HashMap;
import java.util.Map;

public class RadioButtonPage extends BasePage {

    public RadioButtonPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public void clickRadioButton(String choice) {
        Map<String, By> choices = new HashMap<>();
        choices.put("yes", YES_RADIOBUTTON.getLocator());
        choices.put("impressive", IMPRESSIVE_RADIOBUTTON.getLocator());
        choices.put("no", NO_RADIOBUTTON.getLocator());
        elementIsVisible(choices.get(choice)).click();

    }

    public String getTextAlert() {
        return elementIsPresent(TEXT_ALERT.getLocator()).getText();
    }

}
