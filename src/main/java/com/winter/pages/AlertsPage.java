package com.winter.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class AlertsPage extends BasePage{

    public SelenideElement alertButton = $(byId("alertButton"));
    public SelenideElement timerAlertButton = $(byId("timerAlertButton"));
    public SelenideElement confirmButton = $(byId("confirmButton"));
    public SelenideElement promtButton = $(byId("promtButton"));
    public SelenideElement textOkCancel = $(byId("confirmResult"));
    public SelenideElement promptText = $(byId("promptResult"));

    public AlertsPage clickAlertButton(){
        alertButton.click();
        return this;
    }
}
