package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class LinksPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toLinksPage();
    }

    @Test
    public void testSimpleLinks(){
        linksPage.simpleLink.click();
        linksPage.simpleLink.shouldHave(Condition.href("https://demoqa.com/"));
    }

    @Test
    public void testDynamicLink(){
        String currentUrl = linksPage.dynamicLink.text();
        Selenide.refresh();
        String newUrl = linksPage.dynamicLink.text();
        Assert.assertNotEquals(currentUrl,newUrl);
    }
}
