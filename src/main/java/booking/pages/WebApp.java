package booking.pages;

import booking.behavior.MainPage;
import booking.behavior.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebApp implements booking.behavior.WebApp {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebApp(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public MainPage mainPage() {
        return new booking.pages.MainPage(driver, wait);
    }

    @Override
    public SearchPage searchPage() {
        return new booking.pages.SearchPage(driver, wait);
    }
}
