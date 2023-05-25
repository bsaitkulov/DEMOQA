package com.winter.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class UploadDownloadPage extends BasePage{

    public SelenideElement downloadButton = $(byId("downloadButton"));
    public SelenideElement chooseFileButton = $(byId("uploadFile"));
    public SelenideElement uploadedFilePath = $(byId("uploadedFilePath"));



    public UploadDownloadPage clickDownloadButton(){
        elementActions.press(downloadButton);
        return this;
    }
    public UploadDownloadPage uploadFileButton(String path){
        chooseFileButton.setValue(path);
        return this;
    }

}
