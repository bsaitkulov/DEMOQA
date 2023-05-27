package ui;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class WebTablesTest extends BaseUiTest {
    @BeforeClass
    public void navigation(){
        navigate.toWebTablesPage();
    }
    @Test
    public void addUserTest(){
        webTablesPage.clickAdd()
                .inputFirstName("Francesco")
                .inputLastName("Toldo")
                .inputEmail("toldo@gmail.com")
                .inputAge("35")
                .inputSalary("100000")
                .inputDepartment("Sport Department")
                .clickSubmit();
    }
}
