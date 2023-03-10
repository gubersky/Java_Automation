package tools_qa.contract.elements_page;

import java.util.List;

public interface WebTablesPage {
    List<String> addNewPerson();

    List<List<String>> checkAddPerson();

    void searchSomePerson(String keyWord);

    List<String> checkSearchPerson();

    String editPersonInfo();

    void deletePerson();

    String checkDeletePerson();

    List<Integer> selectTableRow();

    int countRows();
}
