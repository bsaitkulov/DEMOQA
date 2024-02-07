package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class AutoCompletePage extends BasePage{

    public SelenideElement autoCompleteMultiple = $(byId("autoCompleteMultipleInput"));
    public SelenideElement autoCompleteSingle = $(byId("autoCompleteSingleInput"));

    public AutoCompletePage inputMultipleColor(String str){

        return this;
    }
}
