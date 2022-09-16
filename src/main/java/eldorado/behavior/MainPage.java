package eldorado.behavior;

import org.openqa.selenium.By;

public interface MainPage {

    MainPage inputSearchValue(String value);
    MainPage deleteSearchValue();
    SearchPage clickSearchButton();
    CartPage goToCart();
    MainPage clickBuyProduct();

}
