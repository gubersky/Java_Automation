package gmail.contract;

import org.openqa.selenium.By;
import gmail.pages.LoginPage;

public interface MainPage {

    LoginPage openLogin();
    Boolean elementIsDisplayed(By element);
}
