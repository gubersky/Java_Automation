package tools_qa.tests.elements_page;

import org.testng.annotations.Test;
import tools_qa.pages.elements_page.RadioButtonPage;
import tools_qa.test_base.TestBase;

import java.util.Objects;

public class TestRadioButtonPage extends TestBase {
    RadioButtonPage radioButtonPage;

    @Test
    public void testRadioButton(){
        radioButtonPage = new RadioButtonPage(driver,"https://demoqa.com/radio-button");
        radioButtonPage.open();

        radioButtonPage.clickRadioButton("yes");
        String alertYes = radioButtonPage.getTextAlert();
        radioButtonPage.clickRadioButton("impressive");
        String alertImpressive = radioButtonPage.getTextAlert();
        radioButtonPage.clickRadioButton("no");
        String alertNo = radioButtonPage.getTextAlert();

        softAssert.assertEquals(alertYes,"Yes");
        softAssert.assertEquals(alertImpressive,"Impressive");
        softAssert.assertTrue(!Objects.equals(alertNo, "No"));
        softAssert.assertAll();
    }
}
