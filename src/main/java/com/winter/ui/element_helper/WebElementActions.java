package com.winter.ui.element_helper;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;



/**
 * @author Nursultan Musakunov
 */

public class WebElementActions {



    public WebElementActions input(SelenideElement element, String txt){
        element.setValue(txt);
        return this;
    }

    public WebElementActions press(SelenideElement element){
        element.click();
        return this;
    }
    public WebElementActions pressDownAndEnter(SelenideElement element){
        element.sendKeys(Keys.DOWN,Keys.ENTER);
        return this;
    }


    public WebElementActions pressUpAndEnter(SelenideElement element){
        element.sendKeys(Keys.UP,Keys.ENTER);
        return this;
    }
    public static void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            System.out.println("error seconds");
        }
    }
}












