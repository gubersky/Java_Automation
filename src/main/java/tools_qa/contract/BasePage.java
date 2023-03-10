package tools_qa.contract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public interface BasePage {
    void open();

    WebElement elementIsVisible(By locator);

    List<WebElement> elementsAreVisible(By locator);

    WebElement elementIsPresent(By locator);

    List<WebElement> elementsArePresent(By locator);

    Boolean elementIsNotVisible(By locator);

    WebElement elementIsClickable(By locator);

    void goToElement(WebElement element);

    void removeFooter();

    void removeFixedBan();

    void actionDoubleClick(WebElement element);

    void actionRightClick(WebElement element);
}
