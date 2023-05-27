package ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;



public class CheckBoxPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toCheckBoxPage();
    }

    @Test
    public void desktopCheckBoxesTest(){
        checkBoxPage.checkDesktop();
       Assert.assertTrue(checkBoxPage.isDesktopBoxesSelected(), "All Desktop checkboxes Selected");
    }

    @Test
    public void workSpaceCheckBoxesTest(){
        checkBoxPage.checkWorkSpace();
        Assert.assertTrue(checkBoxPage.isWorkSpaceBoxesSelected(), "All WorkSpace checkboxes Selected");
    }

    @Test
    public void officeCheckBoxesTest(){
        checkBoxPage.checkOffice();
        Assert.assertTrue(checkBoxPage.isOfficeBoxesSelected(), "All Office checkboxes Selected");
    }

    @Test
    public void downloadsCheckBoxesTest(){
        checkBoxPage.checkDownload();
        Assert.assertTrue(checkBoxPage.isDownloadBoxesSelected(), "All Downloads checkboxes Selected");
    }

    @Test
    public void successMessageTest(){
        Assert.assertTrue(checkBoxPage.successMessage.isDisplayed());
    }

}
