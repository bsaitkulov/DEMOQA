package ui;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import java.net.HttpURLConnection;
import java.net.URL;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;


public class BrokenLinks_ImagesTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toBrokenLinks_Images();
    }
    @Test
    public void validLinkTest() {

        for (SelenideElement link : brokenLinks_images.links) {
            String url = link.getAttribute("href");
            if (url != null) {
                int statusCode = getLinkStatusCode(url);
                if (statusCode >= HttpURLConnection.HTTP_BAD_REQUEST) {
                    link.shouldBe(visible);
                    link.shouldNotHave(Condition.cssClass("active"));
                    System.out.println("Broken link found: " + url);
                }
            }
        }
    }

    private int getLinkStatusCode(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
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

    @Test
    public void validImageTest(){
        for (SelenideElement image : brokenLinks_images.images ) {
            if (image.getAttribute("naturalWidth").equals("0")) {

                String imageUrl = image.getAttribute("src");
                image.shouldNotHave(attribute("href", imageUrl));
                image.shouldBe(visible);
                System.out.println("Broken image found: " + imageUrl);
            }
        }
    }
}
