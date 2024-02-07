package ui;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class AutoCompletePageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toAutoCompletePage();
    }

    @Test
    public void autoComplete1Test(){
        autoCompletePage.autoCompleteMultiple.sendKeys("R");
        autoCompletePage.autoCompleteMultiple.pressEnter();
        Selenide.sleep(2000);


    }
    @Test
    public void autoComplete2Test(){
        autoCompletePage.autoCompleteSingle.sendKeys("R");

    }
}
