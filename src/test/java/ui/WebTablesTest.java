package ui;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.CollectionElementByCondition;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import java.util.List;
import java.util.stream.Collectors;

public class WebTablesTest extends BaseUiTest {

    @Test
    public void addUserTest(){
        navigate.toWebTablesPage();
        webTablesPage.clickAdd()
                .inputFirstName("Francesco")
                .inputLastName("Toldo")
                .inputEmail("toldo@gmail.com")
                .inputAge("35")
                .inputSalary("100000")
                .inputDepartment("Sport Department")
                .clickSubmit();
        String expectedValue = "Francesco";
    }
}
