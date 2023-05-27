package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.sleep;

public class UploadDownloadPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toUpload_DownloadPage();
    }

    @Test
    public void downloadTest() throws InterruptedException {
        uploadDownloadPage.clickDownloadButton();
        sleep(5000);

        // TODO Should set a path correctly
        String downloadPath = "/Users/bakaisaitkulov/AquaProjects/SelenideDemo/build/downloads";
        String expectedFileName = "sampleFile.jpeg";
        File downloadedFile = new File(downloadPath, expectedFileName);
        Assert.assertTrue(downloadedFile.exists());
        System.out.println("Success");
    }
    @Test
    public void uploadTest(){
        uploadDownloadPage.uploadFileButton("/Users/bakaisaitkulov/Amazon/Bottle1.jpg");
        uploadDownloadPage.uploadedFilePath.should(Condition.exist);


    }
}
