package com.winter.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage extends BasePage {

    public SelenideElement fullName = $(byId("userName"));
    public SelenideElement email = $(byId("userEmail"));
    public SelenideElement currentAddress = $(byId("currentAddress"));
    public SelenideElement permanentAddress = $(byId("permanentAddress"));
    public SelenideElement submitBtn = $(byId("submit"));
    public SelenideElement output = $(byId("output"));

    public TextBoxPage goToTextBoxPage(){
        open("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage inputFullName(String str) {
        elementActions.input(fullName, str);
        return this;
    }

    public TextBoxPage inputEmail(String str) {
        elementActions.input(email, str);
        return this;
    }

    public TextBoxPage inputCurAddress(String str) {
        elementActions.input(currentAddress, str);
        return this;
    }

    public TextBoxPage inputPermAddress(String str) {
        elementActions.input(permanentAddress, str);
        return this;
    }

    public TextBoxPage pressSubmitBtn() {
        elementActions.press(submitBtn);
        return this;
    }
}
