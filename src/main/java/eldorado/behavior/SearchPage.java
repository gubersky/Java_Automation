package eldorado.behavior;

import org.openqa.selenium.By;

public interface SearchPage {

    SearchPage addProductToCart();
    ProductPage openProductInfo(int numberOfElement);
}
