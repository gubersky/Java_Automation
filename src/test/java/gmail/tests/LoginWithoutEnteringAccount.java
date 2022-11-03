package gmail.tests;

import gmail.config.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gmail.locators.LoginPageLocators.*;
import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class LoginWithoutEnteringAccount extends TestBase {

    private final static String ALERT = "Введіть електронну адресу або номер телефону";

    @Test
    public void test() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getXpath()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getXpath()));
        loginPage.clickElement(NEXT_BUTTON.getCss());

        Assert.assertTrue(loginPage.getText(ACCOUNT_ALERT.getXpath()).contains(ALERT));
    }
}
