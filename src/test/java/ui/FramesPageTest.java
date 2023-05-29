package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class FramesPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toFramesPage();
    }

    @Test
    public void testFrame1(){
        Selenide.switchTo().frame(framesPage.frame1);
        framesPage.newTabHeading.shouldHave(Condition.exactText("This is a sample page"));
        Selenide.switchTo().defaultContent();
    }
    @Test
    public void testFrame2(){
        Selenide.switchTo().frame(framesPage.frame2);
        framesPage.newTabHeading.shouldHave(Condition.exactText("This is a sample page"));
        Selenide.switchTo().defaultContent();
    }
}
