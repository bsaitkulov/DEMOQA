package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BrowserWindowsPage extends BasePage{

    public SelenideElement newTabButton=$(byId("tabButton"));
    public SelenideElement newTabHeading = $(byId("sampleHeading"));
    public SelenideElement newWindowButton=$(byId("windowButton"));
    public SelenideElement newWindowMessageButton=$(byId("messageWindowButton"));
    public SelenideElement newWindowMessage = $x("//body");

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
