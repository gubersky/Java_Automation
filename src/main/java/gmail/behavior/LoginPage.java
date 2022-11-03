package gmail.behavior;

import org.openqa.selenium.By;


public interface LoginPage {

    LoginPage inputValue(By element, String value);
    Boolean elementIsDisplayed(By element);
    String getText(By element);
    LoginPage clickElement(By element);
}
