package tools_qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class BasePage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final String url;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        this.url = url;

    }

    public void open() {
        driver.get(url);
    }

    public WebElement elementIsVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<WebElement> elementsAreVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public WebElement elementIsPresent(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public List<WebElement> elementsArePresent(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public Boolean elementIsNotVisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public WebElement elementIsClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void goToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void removeFooter() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementsByTagName('footer')[0].remove();");
    }

    public void removeFixedBan() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('fixedban').style.display = 'none'");
    }

    public void actionDoubleClick(WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }

    public void actionRightClick(WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element);
        action.perform();
    }
}
