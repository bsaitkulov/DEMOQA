package com.winter.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage extends BasePage{

    public SelenideElement doubleClickBtn = $(byId("doubleClickBtn"));
    public SelenideElement rightClickBtn = $(byId("rightClickBtn"));
    public SelenideElement clickMeBtn = $(byText("Click Me"));

    public SelenideElement doubleClickMessage = $(byText("You have done a double click"));
    public SelenideElement rightClickMessage = $(byText("You have done a right click"));
    public SelenideElement clickMeMessage = $(byText("You have done a dynamic click"));


    public ButtonsPage doubleClick(){
        doubleClickBtn.doubleClick();
        return this;
    }
    public ButtonsPage rightClick(){
        rightClickBtn.contextClick();
        return this;
    }
    public ButtonsPage clickMe(){
        elementActions.press(clickMeBtn);
        return this;
    }

    public boolean areButtonMessagesDisplayed(){
        if(doubleClickMessage.isDisplayed() && rightClickMessage.isDisplayed() && clickMeMessage.isDisplayed()){

        }
        return true;
    }

}
