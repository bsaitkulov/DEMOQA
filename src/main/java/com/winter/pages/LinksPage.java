package com.winter.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LinksPage extends BasePage{

    public SelenideElement simpleLink = $(byId("simpleLink"));
    public SelenideElement dynamicLink = $(byId("dynamicLink"));
    public SelenideElement homeBanner = $x("//div[@class='home-banner']");


}
