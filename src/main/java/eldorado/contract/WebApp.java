package eldorado.contract;

import eldorado.pages.BasePage;

public interface WebApp {
    BasePage basePage();

    MainPage mainPage();

    SearchPage searchPage();

    ProductPage productPage();

}
