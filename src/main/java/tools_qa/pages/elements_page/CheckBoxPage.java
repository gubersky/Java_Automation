package tools_qa.pages.elements_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools_qa.pages.BasePage;

import java.util.ArrayList;
import java.util.List;

import static tools_qa.locators.CheckBoxPageLocators.*;

public class CheckBoxPage extends BasePage {

    public CheckBoxPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public void openFullList() {
        elementIsVisible(EXPAND_ALL_BUTTON.getLocator()).click();

    }

    public void clickRandomCheckBox() {
        List<WebElement> itemList = elementsAreVisible(LIST_OF_NAME_BOX.getLocator());
        int count = 17;
        int max = 17;
        while (count != 0) {
            WebElement item = itemList.get((int) ((Math.random() * max)));
            if (count > 0) {
                goToElement(item);
                item.click();
                count -= 1;
            } else {
                break;
            }
        }
    }

    public List<String> getCheckCheckBox() {
        List<WebElement> checkList = elementsArePresent(ITEM_CHECK.getLocator());
        List<String> data = new ArrayList<>();
        for (WebElement box : checkList) {
            WebElement title_item = box.findElement(By.xpath(".//ancestor::span[@class='rct-text']"));
            data.add(title_item.getText().replace(" ", "").replace("doc", "")
                    .replace(".", "").toLowerCase());
        }
        return data;
    }

    public List<String> gettextAlert() {
        List<WebElement> alertTextList = elementsAreVisible(TEXT_ALERT.getLocator());
        List<String> data = new ArrayList<>();
        for (WebElement item : alertTextList) {
            data.add(item.getText().replace(" ", "").toLowerCase());

        }
        return data;
    }
}
