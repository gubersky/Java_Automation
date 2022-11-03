package gmail.tests;

import gmail.config.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gmail.locators.LoginPageLocators.*;
import static gmail.locators.LoginPageLocators.PASSWORD_ALERT;
import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class LoginWithoutEnteringPassword extends TestBase {

    private final static String MAIL = "correct.mail@gmail.com";
    private final static String ALERT = "Уведіть пароль";

    @Test
    public void test() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getXpath()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getXpath()));
        loginPage.inputValue(LOGIN_FIELD.getCss(), MAIL)
                .clickElement(NEXT_BUTTON.getCss());

        Assert.assertTrue(loginPage.getText(PASSWORD_ALERT.getXpath()).contains(ALERT));
    }
}
