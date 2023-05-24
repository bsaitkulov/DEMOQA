package com.winter.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage extends BasePage{

    public SelenideElement homeButton = $x("(//button[@aria-label='Toggle'])[1]");
    public SelenideElement homeCheckbox = $x(("//label[@for='tree-node-home']"));
    public SelenideElement desktopButton = $x("(//button[@aria-label='Toggle'])[2]");
    public SelenideElement desktopCheckbox = $x(("//label[@for='tree-node-desktop']"));
    public SelenideElement notesCheckbox = $x(("//label[@for='tree-node-notes']"));
    public SelenideElement commandsCheckbox = $x(("//label[@for='tree-node-commands']"));
    public SelenideElement documentsButton = $x("(//button[@aria-label='Toggle'])[3]");
    public SelenideElement documentsCheckbox = $x(("//label[@for='tree-node-documents']"));
    public SelenideElement workSpaceButton = $x("(//button[@aria-label='Toggle'])[4]");
    public SelenideElement workSpaceCheckbox = $x(("//label[@for='tree-node-workspace']"));
    public SelenideElement reactCheckbox = $x(("//label[@for='tree-node-react']"));
    public SelenideElement angularCheckbox = $x(("//label[@for='tree-node-angular']"));
    public SelenideElement veuCheckbox = $x(("//label[@for='tree-node-veu']"));
    public SelenideElement officeBtn = $(By.xpath("(//button[@aria-label='Toggle'])[5]"));
    public SelenideElement officeCheckBox=$x(("//label[@for='tree-node-office']"));
    public SelenideElement publicCheckbox = $x(("(//label[@for='tree-node-public']"));
    public SelenideElement privateCheckbox = $x(("//label[@for='tree-node-private']"));
    public SelenideElement classifiedCheckbox = $x(("//label[@for='tree-node-classified']"));
    public SelenideElement generalCheckbox = $x(("//label[@for='tree-node-general']"));
    public SelenideElement downloadBtn = $(By.xpath("(//button[@aria-label='Toggle'])[6]"));
    public SelenideElement downloadsCheckbox = $x(("//label[@for='tree-node-downloads']"));
    public SelenideElement wordFileCheckbox = $x(("//label[@for='tree-node-wordFile']"));
    public SelenideElement excelCheckbox = $x(("//label[@for='tree-node-excelFile']"));
    public SelenideElement expandAllBtn = $x("//button[@title='Expand all']");
    public SelenideElement collapseButton = $x("//button[@title='Collapse all']");
    public SelenideElement successMessage = $x("//div[@id='result']");

    public CheckBoxPage goToCheckBox(){
        open("https://demoqa.com/checkbox");
        return this;
    }

    public CheckBoxPage clickExpandAllBtn(){
        expandAllBtn.click();
        return this;
    }

    public CheckBoxPage checkDesktop(){
        clickExpandAllBtn();
        desktopCheckbox.click();
        return this;
    }
    public boolean isDesktopBoxesSelected(){
        if (desktopCheckbox.isSelected() && notesCheckbox.isSelected() &&commandsCheckbox.isSelected()){

        }
        return true;
    }
    public CheckBoxPage checkWorkSpace(){
        workSpaceCheckbox.click();
        return this;
    }

    public boolean isWorkSpaceBoxesSelected(){
        if (workSpaceCheckbox.isSelected() && reactCheckbox.isSelected()
                && angularCheckbox.isSelected() && veuCheckbox.isSelected()){
        }
        return true;
    }
    public CheckBoxPage checkOffice(){
        officeCheckBox.click();
        return this;
    }

    public boolean isOfficeBoxesSelected() {
        if (officeCheckBox.isSelected() && publicCheckbox.isSelected() && privateCheckbox.isSelected()
                && classifiedCheckbox.isSelected() && generalCheckbox.isSelected()) {

        }
        return true;

    }
    public CheckBoxPage checkDownload(){
        downloadsCheckbox.click();
        return this;
    }
    public boolean isDownloadBoxesSelected() {
        if (downloadsCheckbox.isSelected() && wordFileCheckbox.isSelected() && excelCheckbox.isSelected()) {

        }
        return true;
    }
}
