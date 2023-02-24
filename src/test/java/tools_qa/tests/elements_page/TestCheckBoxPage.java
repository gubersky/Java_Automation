package tools_qa.tests.elements_page;

import org.testng.Assert;
import org.testng.annotations.Test;
import tools_qa.pages.elements_page.CheckBoxPage;
import tools_qa.test_base.TestBase;

import java.util.List;

public class TestCheckBoxPage extends TestBase {
    CheckBoxPage checkBoxPage;

    @Test
    public void testCheckBox() {
        checkBoxPage = new CheckBoxPage(driver, "https://demoqa.com/checkbox");
        checkBoxPage.open();

        checkBoxPage.openFullList();
        checkBoxPage.clickRandomCheckBox();

        List<String> selectItem = checkBoxPage.getCheckCheckBox();
        List<String> alertItem = checkBoxPage.gettextAlert();
        Assert.assertEquals(selectItem, alertItem);

    }

}
