package com.winter.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Navigate extends BasePage{

    public SelenideElement elementMenu = $x("(//div[@class='card mt-4 top-card'])[1]");
    public SelenideElement textBoxMenu = $x("//span[text()='Text Box']");
    public SelenideElement checkBoxMenu = $x("//span[text()='Check Box']");
    public SelenideElement radioButtonMenu = $x("//span[text()='Radio Button']");
    public SelenideElement webTablesMenu = $(byText("Web Tables"));
    public SelenideElement buttonsMenu = $(byText("Buttons"));
    public SelenideElement linksMenu = $(byText("Links"));
    public SelenideElement brokenLinks_ImagesMenu = $(byText("Broken Links - Images"));



    public Navigate toTextBoxPage(){
        elementMenu.click();
        textBoxMenu.click();
        return this;
    }
    public Navigate toCheckBoxPage(){
        elementMenu.click();
        checkBoxMenu.click();
        return this;
    }
    public Navigate toRadioButtonPage(){
        elementMenu.click();
        radioButtonMenu.click();
        return this;
    }
    public Navigate toWebTablesPage(){
        elementMenu.click();
        webTablesMenu.click();
        return this;
    }
    public Navigate toButtonsPage(){
        elementMenu.click();
        buttonsMenu.click();
        return this;
    }
    public Navigate toLinksPage(){
        elementMenu.click();
        linksMenu.click();
        return this;
    }
    public Navigate toBrokenLinks_Images(){
        elementMenu.click();
        brokenLinks_ImagesMenu.click();
        return this;
    }
}
