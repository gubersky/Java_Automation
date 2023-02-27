package tools_qa.tests.elements_page;

import org.testng.Assert;
import org.testng.annotations.Test;
import tools_qa.pages.elements_page.WebTablesPage;
import tools_qa.test_base.TestBase;

import java.util.List;

public class TestWebTablesPage extends TestBase {


    @Test
    public void testAddNewPerson() {
        WebTablesPage webTablesPage = new WebTablesPage(driver, "https://demoqa.com/webtables");
        webTablesPage.open();

        List<String> newPerson = webTablesPage.addNewPerson();
        List<List<String>> tableResult = webTablesPage.checkAddPerson();
        Assert.assertTrue(tableResult.contains(newPerson));

    }
}


