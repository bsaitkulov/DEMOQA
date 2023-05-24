package ui;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class RadioButtonPageTest extends BaseUiTest {

    @Test(priority = 1)
    public void testYesRadio(){
        navigate.toRadioButtonPage();
        radioButtonPage.yesRadio.click();
        radioButtonPage.yesMessage.shouldBe(Condition.text("Yes"));
    }
    @Test(priority = 2)
    public void testImpressiveRadio(){
        radioButtonPage.impressiveRadio.click();
       radioButtonPage.impressiveMessage.shouldBe(Condition.text("Impressive"));
    }

    @Test(priority = 3)
    public void testNoRadio(){
        radioButtonPage.noRadio.shouldNotBe(Condition.enabled);
    }

}
