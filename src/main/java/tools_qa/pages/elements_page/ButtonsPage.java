package tools_qa.pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tools_qa.pages.BasePage;

import static tools_qa.locators.ButtonsPageLocators.*;

public class ButtonsPage extends BasePage implements tools_qa.contract.elements_page.ButtonsPage {
    public ButtonsPage(WebDriver driver, String url) {
        super(driver, url);
    }
    @Override
    public String clickOnDifferentButton(String typeClick) {

        switch (typeClick) {
            case ("double") -> {
                actionDoubleClick(elementIsVisible(DOUBLE_CLICK_BUTTON.getLocator()));
                return checkClickButton(DOUBLE_CLICK_MESSAGE.getLocator());
            }
            case ("right") -> {
                actionRightClick(elementIsVisible(RIGHT_CLICK_BUTTON.getLocator()));
                return checkClickButton(RIGHT_CLICK_MESSAGE.getLocator());
            }
            case ("click") -> {
                elementIsVisible(CLICK_ME_BUTTON.getLocator()).click();
                return checkClickButton(CLICK_ME_MESSAGE.getLocator());
            }
        }
        return null;
    }
    @Override
    public String checkClickButton(By locator) {
        return elementIsPresent(locator).getText();

    }
}
