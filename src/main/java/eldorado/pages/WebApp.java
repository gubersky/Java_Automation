package eldorado.pages;

import eldorado.behavior.CartPage;
import eldorado.behavior.MainPage;
import eldorado.behavior.ProductPage;
import eldorado.behavior.SearchPage;
import eldorado.behavior.SelectionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebApp implements eldorado.behavior.WebApp {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebApp(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage mainPage() {
        return new eldorado.pages.MainPage(driver,wait);
    }

    @Override
    public SearchPage searchPage() {
        return new eldorado.pages.SearchPage(driver,wait);
    }

    @Override
    public ProductPage productPage() {
        return new eldorado.pages.ProductPage(driver,wait);
    }

    @Override
    public CartPage cartPage() {
        return new eldorado.pages.CartPage(driver,wait);
    }

    @Override
    public SelectionPage selectionPage() {
        return new eldorado.pages.SelectionPage(driver,wait);
    }
}
