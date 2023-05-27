package ui;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class RadioButtonPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toRadioButtonPage();
    }

    @Test
    public void testYesRadio(){
        radioButtonPage.yesRadio.click();
        radioButtonPage.yesMessage.shouldBe(Condition.text("Yes"));
    }
    @Test
    public void testImpressiveRadio(){
        radioButtonPage.impressiveRadio.click();
       radioButtonPage.impressiveMessage.shouldBe(Condition.text("Impressive"));
    }

    @Test
    public void testNoRadio(){
        radioButtonPage.noRadio.shouldNotBe(Condition.enabled);
    }

}
