package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import static com.codeborne.selenide.Selenide.$x;

public class NestedFramesTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toNestedFramesPage();
    }

    @Test
    public void testParentFrame(){
        Selenide.switchTo().frame(nestedFramesPage.parentFrame);
        nestedFramesPage.parentFrameText.shouldHave(Condition.exactText("Parent frame"));
        Selenide.switchTo().defaultContent();
    }
    @Test
    public void testChildFrame(){
        Selenide.switchTo().frame(nestedFramesPage.parentFrame);
        Selenide.switchTo().frame(nestedFramesPage.childFrame);
        nestedFramesPage.childFrameText.shouldHave(Condition.exactText("Child Iframe"));
        Selenide.switchTo().defaultContent();

    }
}
