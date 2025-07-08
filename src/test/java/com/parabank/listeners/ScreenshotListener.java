package com.parabank.listeners;

import com.parabank.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = (WebDriver) result.getAttribute("driver"); // ✅ fetch it here
        if (driver != null) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
        } else {
            System.out.println("❌ WebDriver is null. Cannot capture screenshot.");
        }
    }
}