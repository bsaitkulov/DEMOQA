package ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;



public class CheckBoxPageTest extends BaseUiTest {

    @Test(priority = 1)
    public void desktopCheckBoxesTest(){
        navigate.toCheckBoxPage();
        checkBoxPage.checkDesktop();
       Assert.assertTrue(checkBoxPage.isDesktopBoxesSelected(), "All Desktop checkboxes Selected");
    }

    @Test(priority = 2)
    public void workSpaceCheckBoxesTest(){
        checkBoxPage.checkWorkSpace();
        Assert.assertTrue(checkBoxPage.isWorkSpaceBoxesSelected(), "All WorkSpace checkboxes Selected");
    }

    @Test(priority = 3)
    public void officeCheckBoxesTest(){
        checkBoxPage.checkOffice();
        Assert.assertTrue(checkBoxPage.isOfficeBoxesSelected(), "All Office checkboxes Selected");
    }

    @Test(priority = 4)
    public void downloadsCheckBoxesTest(){
        checkBoxPage.checkDownload();
        Assert.assertTrue(checkBoxPage.isDownloadBoxesSelected(), "All Downloads checkboxes Selected");
    }

    @Test(priority = 5)
    public void successMessageTest(){
        Assert.assertTrue(checkBoxPage.successMessage.isDisplayed());
    }

}
