package eldorado.behavior;

import org.openqa.selenium.By;

public interface ProductPage {

    ProductPage clickBuyProduct();
    ProductPage elementIsDisplayed(By element);
    String getTitleOfProductNumber(By element);
    int counterCart();

}
