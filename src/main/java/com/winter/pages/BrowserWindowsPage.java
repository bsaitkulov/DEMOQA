package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class BrowserWindowsPage extends BasePage{

    public SelenideElement newTabButton=$(byId("tabButton"));
    public SelenideElement newTabHeading = $(byId("sampleHeading"));
    public SelenideElement newWindowButton=$(byId("windowButton"));
    public SelenideElement newWindowMessageButton=$(byId("messageWindowButton"));
    public SelenideElement newWindowMessage = $(byId("//body[text()='Knowledge increases by sharing but not by saving. " +
            "Please share this website with your friends and in your organization.']"));

    public BrowserWindowsPage clickNewTabButton(){
        elementActions.press(newTabButton);
        return this;
    }
    public BrowserWindowsPage clickNewWindowButton(){
        elementActions.press(newWindowButton);
        return this;
    }
    public BrowserWindowsPage clickNewWindowMessageButton(){
        elementActions.press(newWindowMessageButton);
        return this;
    }
}
