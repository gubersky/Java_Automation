package eldorado.behavior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class GeneralBehavior {

    abstract public boolean elementIsDisplayed(By element);
    abstract public List getWebElements(By element);
    abstract public String getStringFromList(By element);
    abstract public void moveToElement(By element);

}
