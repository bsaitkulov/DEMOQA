package com.winter.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.net.HttpURLConnection;
import java.net.URL;
import static com.codeborne.selenide.Selenide.$x;

public class BrokenLinks_Images extends BasePage{

    public ElementsCollection links = Selenide.$$x("//a");
    public ElementsCollection images = Selenide.$$x("//img");


}
