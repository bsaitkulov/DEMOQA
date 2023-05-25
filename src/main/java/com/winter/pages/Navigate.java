package com.winter.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.winter.ui.element_helper.WebElementActions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Navigate extends BasePage {

    public SelenideElement elementMenu = $x("(//div[@class='card mt-4 top-card'])[1]");
    public SelenideElement alertMenu = $x("(//div[@class='card mt-4 top-card'])[3]");
    public SelenideElement textBoxMenu = $x("//span[text()='Text Box']");
    public SelenideElement checkBoxMenu = $x("//span[text()='Check Box']");
    public SelenideElement radioButtonMenu = $x("//span[text()='Radio Button']");
    public SelenideElement webTablesMenu = $(byText("Web Tables"));
    public SelenideElement buttonsMenu = $(byText("Buttons"));
    public SelenideElement linksMenu = $(byText("Links"));
    public SelenideElement brokenLinks_ImagesMenu = $(byText("Broken Links - Images"));
    public SelenideElement upload_downloadMenu = $(byText("Upload and Download"));
    public SelenideElement dynamicPropertiesMenu = $(byText("Dynamic Properties"));
    public SelenideElement browserWindowsMenu = $(byText("Browser Windows"));
    public SelenideElement alertsMenu = $(byText("Alerts"));



    public Navigate toTextBoxPage() {
        elementMenu.click();
        textBoxMenu.click();
        return this;
    }

    public Navigate toCheckBoxPage() {
        elementMenu.click();
        checkBoxMenu.click();
        return this;
    }

    public Navigate toRadioButtonPage() {
        elementMenu.click();
        radioButtonMenu.click();
        return this;
    }

    public Navigate toWebTablesPage() {
        elementMenu.click();
        webTablesMenu.click();
        return this;
    }

    public Navigate toButtonsPage() {
        elementMenu.click();
        buttonsMenu.click();
        return this;
    }

    public Navigate toLinksPage() {
        elementMenu.click();
        linksMenu.click();
        return this;
    }

    public Navigate toBrokenLinks_Images() {
        elementMenu.click();
        brokenLinks_ImagesMenu.click();
        return this;
    }

    public Navigate toUpload_DownloadPage() {
        elementMenu.click();
        Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
        Selenide.sleep(2000);
        upload_downloadMenu.click();
        return this;
    }
    public Navigate toDynamicPropertiesPage() {
        elementMenu.click();
        Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
        Selenide.sleep(2000);
        dynamicPropertiesMenu.click();
        return this;
    }
    public Navigate toBrowserWindowsPage() {
        alertMenu.click();
        browserWindowsMenu.click();
        return this;
    }
    public Navigate toAlertsPage() {
        alertMenu.click();
        alertsMenu.click();
        return this;
    }
}