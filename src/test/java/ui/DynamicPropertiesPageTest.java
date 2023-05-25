package ui;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class DynamicPropertiesPageTest extends BaseUiTest {

    @Test(priority = 1)
    @Owner("Bakai Saitkulov")
    public void colorChangeButtonTest(){
        navigate.toDynamicPropertiesPage();
        String before = dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        dynamicPropertiesPage.colorChange();
        String after = dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        dynamicPropertiesPage.colorChangeButton.shouldNotBe(Condition.cssValue(before,after));
    }
    @Test(priority = 2)
    public void enableAfterButtonTest(){
        dynamicPropertiesPage.enableAfter()
                .enableAfterButton.shouldBe(Condition.enabled);
    }
    @Test(priority = 3)
    public void visibleAfterButton(){
        dynamicPropertiesPage.visibleAfter()
                .visibleAfterButton.shouldBe(Condition.visible);
    }
}
