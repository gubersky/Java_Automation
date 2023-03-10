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

public class BasePage implements tools_qa.contract.BasePage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final String url;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        this.url = url;

    }
    @Override
    public void open() {
        driver.get(url);
    }
    @Override
    public WebElement elementIsVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    @Override
    public List<WebElement> elementsAreVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    @Override
    public WebElement elementIsPresent(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    @Override
    public List<WebElement> elementsArePresent(By locator) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    @Override
    public Boolean elementIsNotVisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    @Override
    public WebElement elementIsClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    @Override
    public void goToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }
    @Override
    public void removeFooter() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementsByTagName('footer')[0].remove();");
    }
    @Override
    public void removeFixedBan() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('fixedban').style.display = 'none'");
    }
    @Override
    public void actionDoubleClick(WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element);
        action.perform();
    }
    @Override
    public void actionRightClick(WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element);
        action.perform();
    }
}
