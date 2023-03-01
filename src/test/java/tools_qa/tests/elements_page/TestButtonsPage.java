package tools_qa.tests.elements_page;

import org.testng.annotations.Test;
import tools_qa.pages.elements_page.ButtonsPage;
import tools_qa.test_base.TestBase;

public class TestButtonsPage extends TestBase {

    @Test
    public void testButtonsPage(){
        ButtonsPage buttonsPage = new ButtonsPage(driver,"https://demoqa.com/buttons");
        buttonsPage.open();

        String doubleClick = buttonsPage.clickOnDifferentButton("double");
        String rightClick = buttonsPage.clickOnDifferentButton("right");
        String click = buttonsPage.clickOnDifferentButton("click");

        softAssert.assertEquals(doubleClick,"You have done a double click");
        softAssert.assertEquals(rightClick,"You have done a right click");
        softAssert.assertEquals(click,"You have done a dynamic click");
        softAssert.assertAll();
    }
}
