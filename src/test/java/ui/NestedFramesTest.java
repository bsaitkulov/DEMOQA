package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class NestedFramesTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toNestedFramesPage();
    }

    @Test
    public void testParentFrame(){
        Selenide.switchTo().frame(nestedFramesPage.parentFrame);
        nestedFramesPage.parentFrameText.shouldHave(Condition.exactText("Parent frame"));
    }
}
