package gmail.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import gmail.pages.AccountPage;
import gmail.pages.LoginPage;
import gmail.pages.MainPage;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainPage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/intl/uk/gmail/about/");

        mainPage = new MainPage(driver,wait);
        loginPage = new LoginPage(driver,wait);
        accountPage = new AccountPage(driver,wait);
    }

    @AfterTest
    public void after() {
        driver.quit();
    }
}

