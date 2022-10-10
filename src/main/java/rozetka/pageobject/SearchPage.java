package rozetka.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    By btnCheck = By.xpath("//a[@data-id='Rozetka']");
    By setPricePick = By.xpath("//input[@formcontrolname='max']");
    By submitBtnPrice = By.xpath("//button[@type='submit']");
    By discountProductBtn = By.xpath("//span[@class='goods-tile__label promo-label promo-label_type_action ng-star-inserted']/..");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPage setSeller() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnCheck));
        driver.findElement(btnCheck).click();
        return this;
    }

    public SearchPage setPrice(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setPricePick));
        driver.findElement(setPricePick).clear();
        driver.findElement(setPricePick).sendKeys(value);
        return this;
    }

    public SearchPage btnPriceClick() {
        driver.findElement(submitBtnPrice);
        return this;
    }

    public ProductPage discountProductClick() {
        driver.findElement(discountProductBtn).click();
        return new ProductPage(driver,wait);
    }
}
