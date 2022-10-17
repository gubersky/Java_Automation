package eldorado.config;

import eldorado.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected MainPage mainPage;
    protected SearchPage searchPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected SelectionPage selectionPage;
    protected SoftAssert softAssert;


    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://eldorado.ua");

        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        productPage = new ProductPage(driver, wait);
        cartPage = new CartPage(driver, wait);
        selectionPage = new SelectionPage(driver, wait);
        softAssert = new SoftAssert();
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
