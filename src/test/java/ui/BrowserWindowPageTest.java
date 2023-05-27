package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverConditions.url;

public class BrowserWindowPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toBrowserWindowsPage();
    }
    @Test
    public void newTabTest(){
        browserWindowsPage.newTabButton.click();
        Selenide.switchTo().window(1);
        browserWindowsPage.newTabHeading.shouldBe(Condition.visible);
    }
    @Test
    public void newWindowTabTest(){
        browserWindowsPage.newWindowButton.click();
        Selenide.switchTo().window(1);
        browserWindowsPage.newTabHeading.shouldHave(Condition.exactText("This is a sample page"));
    }

    @Test //Works on Safari
    public void newWindowMessageTest(){
        browserWindowsPage.newWindowMessageButton.click();
        switchTo().window(1);
       browserWindowsPage.newWindowMessage.shouldHave(Condition.exactText("Knowledge increases by sharing but not by saving. " +
               "Please share this website with your friends and in your organization."));
    }
}
