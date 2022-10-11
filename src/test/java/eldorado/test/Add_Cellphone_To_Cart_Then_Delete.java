package eldorado.test;

import eldorado.specification.TestBase;

import org.testng.annotations.Test;

import static eldorado.webelement.MainPageElement.*;

public class Add_Cellphone_To_Cart_Then_Delete extends TestBase {


    @Test
    public void test() throws InterruptedException {

        mainPage.moveToElement(CATALOG_OF_GOODS_SMARTPHONES_AND_PHONES.getXpath());
        Thread.sleep(5000);

    }
}
