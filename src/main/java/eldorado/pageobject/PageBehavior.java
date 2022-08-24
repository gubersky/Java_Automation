package eldorado.pageobject;

import org.openqa.selenium.By;

import java.util.List;

public abstract class PageBehavior {

    abstract public boolean elementIsDisplayed(By element);
    abstract public List getWebElements(By element);

}
