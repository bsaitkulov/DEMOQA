package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class AccordianPage extends BasePage{

    public SelenideElement section1Heading = $(byId("section1Heading"));
    public SelenideElement section1Content = $(byId("section1Content"));
    public SelenideElement section2Heading = $(byId("section2Heading"));
    public SelenideElement section2Content = $(byId("section2Content"));
    public SelenideElement section3Heading = $(byId("section3Heading"));
    public SelenideElement section3Content = $(byId("section3Content"));
}
