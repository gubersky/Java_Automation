package gmail.contract;

import org.openqa.selenium.By;

public interface AccountPage {

    Boolean elementIsDisplayed(By element);
    String getText(By element);
}
