package com.winter.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonPage extends BasePage{

    public SelenideElement yesRadio = $(byText("Yes"));
    public SelenideElement impressiveRadio = $(byText("Impressive"));
    public SelenideElement noRadio = $x("//input[@id='noRadio']");
    public SelenideElement yesMessage = $x("//span[text()='Yes']");
    public SelenideElement impressiveMessage = $x("//span[text()='Impressive']");



}
