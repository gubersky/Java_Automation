package booking.test_base;

import booking.contract.WebApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestBase {
    protected WebApp app;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected SoftAssert softAssert;


    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.booking.com");

        app = new booking.pages.WebApp(driver,wait);
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}
