package tools_qa.contract.elements_page;

import java.util.List;

public interface CheckBoxPage {
    void openFullList();

    void clickRandomCheckBox();

    List<String> getCheckCheckBox();

    List<String> gettextAlert();
}
