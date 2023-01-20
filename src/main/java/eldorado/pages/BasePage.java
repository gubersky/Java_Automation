package eldorado.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    protected BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean elementIsDisplayed(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return driver.findElement(element).isDisplayed();
    }

    public List<WebElement> getWebElements(By element) {
        return driver.findElements(element);
    }

    public String getStringFromList(By element) {
        List<WebElement> date = driver.findElements(element);
        for (WebElement elements : date) {
            return elements.getAttribute("outerText");
        }
        return null;
    }

}
