package rozetka.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PickPage {

    By btnPick = By.xpath("//a[@title='Ноутбуки']");

    private WebDriver driver;
    private WebDriverWait wait;

    public PickPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPage btnPickClick() {
        driver.findElement(btnPick).click();
        return new SearchPage(driver,wait);
    }
}
