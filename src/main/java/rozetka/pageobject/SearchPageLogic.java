package rozetka.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLogic {

    By btnCheck = By.xpath("//a[@data-id='Rozetka']");
    By setPricePick = By.xpath("//input[@formcontrolname='max']");
    By submitBtnPrice = By.xpath("//button[@type='submit']");
    By discountProductBtn = By.xpath("//span[@class='goods-tile__label promo-label promo-label_type_action ng-star-inserted']/..");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLogic setSeller() {
        driver.findElement(btnCheck).click();
        return this;
    }

    public SearchPageLogic setPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setPricePick));
        driver.findElement(setPricePick).clear();
        driver.findElement(setPricePick).sendKeys("100000");
        return this;
    }

    public SearchPageLogic btnPriceClick() {
        driver.findElement(submitBtnPrice);
        return this;
    }

    public ProductPageLogic discountProductClick() {
        driver.findElement(discountProductBtn).click();
        return new ProductPageLogic(driver,wait);
    }
}
