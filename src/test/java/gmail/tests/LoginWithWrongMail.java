package gmail.tests;

import gmail.config.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gmail.locators.LoginPageLocators.*;
import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class LoginWithWrongMail extends TestBase {

    private final static String MAIL = "wrong.mail@gmail.com";
    private final static String ALERT = "Не вдалося знайти ваш обліковий запис Google";

    @Test
    public void test() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getXpath()));
        mainPage.openLogin();

        loginPage.inputValue(LOGIN_FIELD.getCss(),MAIL)
                .clickElement(NEXT_BUTTON.getCss());

        Assert.assertTrue(loginPage.getText(ACCOUNT_ALERT.getXpath()).contains(ALERT));
    }
}
