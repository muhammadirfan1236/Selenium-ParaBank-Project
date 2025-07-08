package com.parabank.utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;


public class ScreenshotUtil {

    public static void captureScreenshot(WebDriver driver, String testName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = "screenshots/" + testName + "_" + timestamp + ".png";

        try {
            FileUtils.copyFile(src, new File(screenshotName));
            System.out.println("📸 Screenshot saved: " + screenshotName);
        } catch (IOException e) {
            System.out.println(" Failed to save screenshot: " + e.getMessage());
        }
    }
}
