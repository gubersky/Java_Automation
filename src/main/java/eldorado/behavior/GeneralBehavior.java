package eldorado.behavior;

import eldorado.pages.SelectionPage;
import org.openqa.selenium.By;

import java.util.List;

public abstract class GeneralBehavior {

    abstract public boolean elementIsDisplayed(By element);
    abstract public List getWebElements(By element);
    abstract public String getStringFromList(By element);
    abstract public void moveToElement(By element);
    abstract public SelectionPage click(By element);

}
