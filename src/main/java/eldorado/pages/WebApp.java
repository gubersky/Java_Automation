package eldorado.pages;

import eldorado.contract.MainPage;
import eldorado.contract.ProductPage;
import eldorado.contract.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebApp implements eldorado.contract.WebApp {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebApp(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public BasePage basePage() {
        return new eldorado.pages.BasePage(driver,wait);
    }

    @Override
    public MainPage mainPage() {
        return new eldorado.pages.MainPage(driver, wait);
    }

    @Override
    public SearchPage searchPage() {
        return new eldorado.pages.SearchPage(driver, wait);
    }

    @Override
    public ProductPage productPage() {
        return new eldorado.pages.ProductPage(driver, wait);
    }

}
