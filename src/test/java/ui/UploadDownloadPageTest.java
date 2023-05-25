package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.sleep;

public class UploadDownloadPageTest extends BaseUiTest {

    @Test(priority = 1)
    public void downloadTest() throws InterruptedException {
        navigate.toUpload_DownloadPage();
        uploadDownloadPage.clickDownloadButton();
        sleep(5000);
        // Should set a path correctly
        String downloadPath = "/Users/bakaisaitkulov/AquaProjects/SelenideDemo/build/downloads";
        String expectedFileName = "sampleFile.jpeg";
        File downloadedFile = new File(downloadPath, expectedFileName);
        Assert.assertTrue(downloadedFile.exists());
        System.out.println("Success");
    }
    @Test
    public void uploadTest(){
        navigate.toUpload_DownloadPage();
        uploadDownloadPage.uploadFileButton("/Users/bakaisaitkulov/Amazon/Bottle1.jpg");
        uploadDownloadPage.uploadedFilePath.should(Condition.exist);


    }
}
