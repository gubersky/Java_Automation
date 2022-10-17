package eldorado.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectionPage implements eldorado.behavior.SelectionPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SelectionPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
