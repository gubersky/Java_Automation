package rozetka.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    By btnMenu = By.xpath("//a[@class='menu-categories__link']");

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public PickPage btnMenuClick() {
        driver.findElement(btnMenu).click();
        return new PickPage(driver, wait);
    }
}
