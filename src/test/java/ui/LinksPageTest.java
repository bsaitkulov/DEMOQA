package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class LinksPageTest extends BaseUiTest {

    @Test(priority = 1)
    public void testSimpleLinks(){
        navigate.toLinksPage();
        linksPage.simpleLink.click();
        linksPage.simpleLink.shouldHave(Condition.href("https://demoqa.com/"));
    }

    @Test(priority = 2)
    public void testDynamicLink(){
        String currentUrl = linksPage.dynamicLink.text();
        Selenide.refresh();
        String newUrl = linksPage.dynamicLink.text();
        Assert.assertNotEquals(currentUrl,newUrl);
    }
}
