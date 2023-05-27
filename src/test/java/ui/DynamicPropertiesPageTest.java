package ui;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

public class DynamicPropertiesPageTest extends BaseUiTest {

    @BeforeClass
    public void navigation(){
        navigate.toDynamicPropertiesPage();
    }

    @Test
    @Owner("Bakai Saitkulov")
    public void colorChangeButtonTest(){
        String before = dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        dynamicPropertiesPage.colorChange();
        String after = dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        dynamicPropertiesPage.colorChangeButton.shouldNotBe(Condition.cssValue(before,after));
    }
    @Test
    public void enableAfterButtonTest(){
        dynamicPropertiesPage.enableAfter()
                .enableAfterButton.shouldBe(Condition.enabled);
    }
    @Test
    public void visibleAfterButton(){
        dynamicPropertiesPage.visibleAfter()
                .visibleAfterButton.shouldBe(Condition.visible);
    }
}
