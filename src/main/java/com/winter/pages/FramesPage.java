package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class FramesPage extends BasePage{

    public SelenideElement frame1 = $((byId("frame1")));
    public SelenideElement frame2 = $((byId("frame2")));
    public SelenideElement newTabHeading = $(byId("sampleHeading"));

}
