package tools_qa.tests;

import org.testng.annotations.Test;

import tools_qa.pages.elements_page.TextBoxPage;
import tools_qa.test_base.TestBase;

public class elements_page extends TestBase {
    TextBoxPage textBoxPage;


    @Test
    public void test() {
        textBoxPage = new TextBoxPage(driver, "https://demoqa.com/text-box");
        textBoxPage.open();

        String[] createdPerson = textBoxPage.fillAllField();
        String[] currentPerson = textBoxPage.checkFieldForm();

        softAssert.assertEquals(createdPerson[0],currentPerson[0],"Full name does not match");
        softAssert.assertEquals(createdPerson[1],currentPerson[1],"Email does not match");
        softAssert.assertEquals(createdPerson[2],currentPerson[2],"Current address does not match");
        softAssert.assertEquals(createdPerson[3],currentPerson[3],"Permanent address does not match");
        softAssert.assertAll();

    }
}
