package gmail.test;

import gmail.test_base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gmail.locators.AccountPageLocators.USER_LOGO;
import static gmail.locators.LoginPageLocators.*;
import static gmail.locators.MainPageLocators.LOGIN_BUTTON;

public class TestLogin extends TestBase {
    private final static String VALID_PHONE_NUMBER = "+380999999999";
    private final static String VALID_MAIL = "correct.mail@gmail.com";
    private final static String VALID_PASSWORD = "correct password";
    private final static String WRONG_PHONE_NUMBER = "+380999999999";
    private final static String WRONG_MAIL = "wrong.mail@gmail.com";
    private final static String WRONG_PASSWORD = "wrong password";
    private final static String ENTER_MAIL_ALERT = "Введіть електронну адресу або номер телефону";
    private final static String ENTER_PASSWORD_ALERT = "Уведіть пароль";
    private final static String USER_NOT_FOUND_ALERT = "Не вдалося знайти ваш обліковий запис Google";
    private final static String WRONG_PASSWORD_ALERT = "Неправильний пароль. Повторіть спробу або натисніть" +
                                                       " \"Забули пароль?\", щоб скинути його.";

    @Test
    public void loginWithWrongPhoneNumber() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        loginPage.inputValue(LOGIN_FIELD.getLocator(), WRONG_PHONE_NUMBER)
                .clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(loginPage.getText(ACCOUNT_ALERT.getLocator()).contains(USER_NOT_FOUND_ALERT));
    }

    @Test
    public void loginWithWrongMail() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        loginPage.inputValue(LOGIN_FIELD.getLocator(), WRONG_MAIL)
                .clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(loginPage.getText(ACCOUNT_ALERT.getLocator()).contains(USER_NOT_FOUND_ALERT));
    }

    @Test
    public void loginWithValidUserPhoneAndPassword() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getLocator()));
        loginPage.inputValue(LOGIN_FIELD.getLocator(), VALID_PHONE_NUMBER)
                .clickElement(NEXT_BUTTON.getLocator())
                .inputValue(PASSWORD_FIELD.getLocator(), VALID_PASSWORD)
                .clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(accountPage.elementIsDisplayed(USER_LOGO.getLocator()));
        Assert.assertTrue(accountPage.getText(USER_LOGO.getLocator()).contains(VALID_MAIL));
    }

    @Test
    public void loginWithValidMailAndWrongPassword() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getLocator()));
        loginPage.inputValue(LOGIN_FIELD.getLocator(), VALID_MAIL)
                .clickElement(NEXT_BUTTON.getLocator())
                .inputValue(PASSWORD_FIELD.getLocator(),WRONG_PASSWORD)
                .clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(loginPage.getText(PASSWORD_ALERT.getLocator()).contains(WRONG_PASSWORD_ALERT));
    }

    @Test
    public void loginWithValidMailAndValidPassword() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getLocator()));
        loginPage.inputValue(LOGIN_FIELD.getLocator(), VALID_MAIL)
                .clickElement(NEXT_BUTTON.getLocator())
                .inputValue(PASSWORD_FIELD.getLocator(), VALID_PASSWORD)
                .clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(accountPage.elementIsDisplayed(USER_LOGO.getLocator()));
        Assert.assertTrue(accountPage.getText(USER_LOGO.getLocator()).contains(VALID_MAIL));
    }

    @Test
    public void loginWithoutEnteringPassword() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getLocator()));
        loginPage.inputValue(LOGIN_FIELD.getLocator(), VALID_MAIL)
                .clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(loginPage.getText(PASSWORD_ALERT.getLocator()).contains(ENTER_PASSWORD_ALERT));
    }

    @Test
    public void loginWithoutEnteringAccount() {
        Assert.assertTrue(mainPage.elementIsDisplayed(LOGIN_BUTTON.getLocator()));
        mainPage.openLogin();

        Assert.assertTrue(loginPage.elementIsDisplayed(LOGIN_SCREEN.getLocator()));
        loginPage.clickElement(NEXT_BUTTON.getLocator());

        Assert.assertTrue(loginPage.getText(ACCOUNT_ALERT.getLocator()).contains(ENTER_MAIL_ALERT));
    }
}
