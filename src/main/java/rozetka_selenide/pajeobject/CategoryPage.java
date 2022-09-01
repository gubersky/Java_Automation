package rozetka_selenide.pajeobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CategoryPage {

    SelenideElement clickCategory = $(By.xpath("//a[@title='Ноутбуки']"));

    public SearchPage clickOnLaptopCategory() {
        clickCategory.click();
        return page(SearchPage.class);
    }
}
