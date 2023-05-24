package ui;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class TextBoxPageTest extends BaseUiTest {


    @Test
    public void completeFormTest(){
        navigate.toTextBoxPage();
        textBoxPage.inputFullName("Francesco Toldo")
                .inputEmail("toldo@gmail.com")
                .inputCurAddress("San Marco piazza, Roma")
                .inputPermAddress("Villa Nova, Roma")
                .submitBtn.click();
        textBoxPage.output.shouldBe(Condition.text("Name:Francesco Toldo\n" +
                "Email:toldo@gmail.com\n" +
                "Current Address :San Marco piazza, Roma\n" +
                "Permananet Address :Villa Nova, Roma"));
    }
}
