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

    @Test
    public void testSearchPerson() {
        WebTablesPage webTablesPage = new WebTablesPage(driver, "https://demoqa.com/webtables");
        webTablesPage.open();

        String keyWord = webTablesPage.addNewPerson().get((int) (Math.random() * 5));
        webTablesPage.searchSomePerson(keyWord);
        List<String> tableRow = webTablesPage.checkSearchPerson();
        Assert.assertTrue(tableRow.contains(keyWord));

    }

    @Test
    public void testEditPerson() {
        WebTablesPage webTablesPage = new WebTablesPage(driver, "https://demoqa.com/webtables");
        webTablesPage.open();

        String keyWord = webTablesPage.addNewPerson().get((int) (Math.random() * 5));
        webTablesPage.searchSomePerson(keyWord);
        String editValue = webTablesPage.editPersonInfo();
        List<String> tableRow = webTablesPage.checkSearchPerson();
        Assert.assertTrue(tableRow.contains(editValue));

    }

    @Test
    public void testDeletePerson() {
        WebTablesPage webTablesPage = new WebTablesPage(driver, "https://demoqa.com/webtables");
        webTablesPage.open();

        String keyWord = webTablesPage.addNewPerson().get((int) (Math.random() * 5));
        webTablesPage.searchSomePerson(keyWord);
        webTablesPage.deletePerson();
        String text = webTablesPage.checkDeletePerson();
        Assert.assertEquals(text, "No rows found");

    }

    @Test
    public void testChangeCountRow() {
        WebTablesPage webTablesPage = new WebTablesPage(driver, "https://demoqa.com/webtables");
        webTablesPage.open();

        List<Integer> countRows = List.of(5, 10, 20, 25, 50, 100);
        List<Integer> result = webTablesPage.selectTableRow();
        Assert.assertEquals(result,countRows);

    }
}


