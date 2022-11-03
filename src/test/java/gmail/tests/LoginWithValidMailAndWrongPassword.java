package gmail.tests;

import gmail.config.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gmail.locators.LoginPageLocators.*;
import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class LoginWithValidMailAndWrongPassword extends TestBase {

    private final static String MAIL = "correct.mail@gmail.com";
    private final static String PASSWORD = "wrong password";
    private final static String ALERT = "Неправильний пароль. Повторіть спробу або натисніть \"Забули пароль?\", щоб скинути його.";

    @Test
    public void test() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getXpath()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getXpath()));
        loginPage.inputValue(LOGIN_FIELD.getCss(), MAIL)
                .clickElement(NEXT_BUTTON.getCss())
                .inputValue(PASSWORD_FIELD.getCss(), PASSWORD)
                .clickElement(NEXT_BUTTON.getCss());

        Assert.assertTrue(loginPage.getText(PASSWORD_ALERT.getXpath()).contains(ALERT));
    }
}
