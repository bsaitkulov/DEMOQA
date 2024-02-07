package ui;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class AccordianPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toAccordianPage();
    }

    @Test
    public void heading1Test(){
        accordianPage.section1Heading.click();
        accordianPage.section1Content.shouldBe(Condition.innerText(" It was popularised in the 1960s"));
    }
    @Test
    public void heading2Test(){
        accordianPage.section2Heading.click();
        accordianPage.section2Content.shouldBe(Condition.partialText("Contrary to popular belief, Lorem Ipsum is not simply random text."));
    }
    @Test
    public void heading3Test(){
        accordianPage.section3Heading.click();
        accordianPage.section3Content.shouldBe(Condition.visible);
    }
}
