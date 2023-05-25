package com.winter.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class DynamicPropertiesPage extends BasePage{

    public SelenideElement enableAfterButton = $(byId("enableAfter"));
    public SelenideElement colorChangeButton = $(byId("colorChange"));
    public SelenideElement visibleAfterButton = $(byId("visibleAfter"));


    public DynamicPropertiesPage enableAfter(){
        Selenide.sleep(6000);
        enableAfterButton.click();
        return this;
    }

    public DynamicPropertiesPage colorChange(){
        Selenide.sleep(6000);
        colorChangeButton.click();
        return this;
    }
    public DynamicPropertiesPage visibleAfter(){
        Selenide.sleep(7000);
        visibleAfterButton.click();
        return this;
    }
}
