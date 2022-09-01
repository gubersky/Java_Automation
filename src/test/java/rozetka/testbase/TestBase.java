package rozetka.testbase;

import eldorado.pageobject.CartPage;
import eldorado.pageobject.MainPage;
import eldorado.pageobject.ProductPage;
import eldorado.pageobject.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import rozetka.pageobject.MainPageLogic;
import rozetka.pageobject.PickPageLogic;
import rozetka.pageobject.ProductPageLogic;
import rozetka.pageobject.SearchPageLogic;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected MainPageLogic mainPageLogic;
    protected PickPageLogic pickPageLogic;
    protected ProductPageLogic productPageLogic;
    protected SearchPageLogic searchPageLogic;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rozetka.com.ua/");

        mainPageLogic = new MainPageLogic(driver,wait);
        pickPageLogic = new PickPageLogic(driver,wait);
        productPageLogic = new ProductPageLogic(driver,wait);
        searchPageLogic = new SearchPageLogic(driver,wait);
        softAssert = new SoftAssert();
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
