package ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class ButtonsPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toButtonsPage();
    }
    @Test
    public void testButtonPage(){
        buttonsPage.doubleClick()
                .rightClick()
                .clickMe();
        Assert.assertTrue(buttonsPage.areButtonMessagesDisplayed());
    }
}
