package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class ModalDialogPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toModalDialogPage();
    }
    @Test
    public void smallModalTest(){
        modalDialogsPage.smallModal.click();
        String smallText = modalDialogsPage.smallModalText.getText();
        modalDialogsPage.smallModalText.shouldHave(Condition.exactText(smallText));
        modalDialogsPage.closeSmallModal.click();
    }
    @Test
    public void largeModalTest(){
       modalDialogsPage.largeModal.click();
       String largeText = modalDialogsPage.largeModalText.getText();
        modalDialogsPage.largeModalText.shouldHave(Condition.exactText(largeText));
        modalDialogsPage.closeLargeModal.click();

    }
}
