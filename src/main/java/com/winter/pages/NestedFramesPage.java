package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NestedFramesPage extends BasePage{

    public SelenideElement parentFrame = $((byId("frame1")));
    public SelenideElement childFrame = $x(("//iframe[@srcdoc='<p>Child Iframe</p>']"));
    public SelenideElement parentFrameText = $x("//body[text()='Parent frame']");

}
