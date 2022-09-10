package rozetka_selenide.pajeobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;

public class CategoryPage {

    public static SelenideElement clickCategory = $(By.xpath("//a[@title='Ноутбуки']"));

    public SearchPage clickOnLaptopCategory(By element) {
        element(element).click();
        return page(SearchPage.class);
    }
}
