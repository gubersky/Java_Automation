package rozetka.test_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import rozetka.pageobject.MainPage;
import rozetka.pageobject.PickPage;
import rozetka.pageobject.ProductPage;
import rozetka.pageobject.SearchPage;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected MainPage mainPage;
    protected PickPage pickPage;
    protected ProductPage productPage;
    protected SearchPage searchPage;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rozetka.com.ua/");

        mainPage = new MainPage(driver, wait);
        pickPage = new PickPage(driver, wait);
        productPage = new ProductPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        softAssert = new SoftAssert();
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
