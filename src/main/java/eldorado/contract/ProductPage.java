package eldorado.contract;

import org.openqa.selenium.By;

public interface ProductPage {

    ProductPage clickBuyProduct();
    String getTitleOfProductNumber(By element);
    int counterCart();

}
