package com.winter.listeners;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.codeborne.selenide.Selenide.screenshot;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        screenshot(result.getMethod().getMethodName());
    }
}
