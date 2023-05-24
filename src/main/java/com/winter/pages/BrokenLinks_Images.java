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
    public SelenideElement homeBanner = $x("//div[@class='home-banner']");


    private int getStatusCode(String url) {
        try {
            URL linkUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int statusCode = connection.getResponseCode();
            connection.disconnect();
            return statusCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void getBrokenLinks() {
        for (SelenideElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                int statusCode = getStatusCode(url);
                if (statusCode >= 400) {
                    System.out.println("Broken link found: " + url);
                }
            }
        }
    }

    public void getBrokenImage(){
        for (SelenideElement image : images) {
            if (image.getAttribute("naturalWidth").equals("0")) {
                String imageUrl = image.getAttribute("src");
                    System.out.println("Broken image found: " + imageUrl);
                }
            }
        }
}
