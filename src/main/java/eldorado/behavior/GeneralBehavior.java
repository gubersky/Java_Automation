package eldorado.behavior;

import org.openqa.selenium.By;

import java.util.List;

public abstract class GeneralBehavior {

    abstract public boolean elementIsDisplayed(By element);
    abstract public List getWebElements(By element);

}
