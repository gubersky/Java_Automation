package gmail.tests;

import gmail.config.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gmail.locators.AccountPageLocators.USER_LOGO;
import static gmail.locators.LoginPageLocators.*;
import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class LoginWithValidMailAndPassword extends TestBase {

    private final static String MAIL = "correct.mail@gmail.com";
    private final static String PASSWORD = "correct password";

    @Test
    public void test() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getXpath()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getXpath()));
        loginPage.inputValue(LOGIN_FIELD.getCss(), MAIL)
                .clickElement(NEXT_BUTTON.getCss())
                .inputValue(PASSWORD_FIELD.getCss(), PASSWORD)
                .clickElement(NEXT_BUTTON.getCss());

        Assert.assertTrue(accountPage.elementIsDisplayed(USER_LOGO.getXpath()));
        Assert.assertTrue(accountPage.getText(USER_LOGO.getXpath()).contains(MAIL));
    }
}
