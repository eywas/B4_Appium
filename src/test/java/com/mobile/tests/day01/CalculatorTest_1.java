package com.mobile.tests.day01;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest_1 {

    AppiumDriver<MobileElement> driver; // before version 8
    // AppiumDriver driver;  // after version 8

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // capabilities.setCapability("platformName", "Android"); alttaki komutla aynı şey
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.VERSION, "11.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");

        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        //driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); alttaki komutla aynı şey
        driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),capabilities);
        MobileElement digit2 = driver.findElement(By.id("com.android.calculator:id/digit_2"));
        MobileElement plusBtn = driver.findElement(By.id("com.android.calculator:id/op_add"));
        MobileElement digit3 = driver.findElement(By.id("com.android.calculator:id/digit_3"));
        MobileElement equalBtn = driver.findElement(By.id("com.android.calculator:id/eq"));

        digit2.click();
        plusBtn.click();
        digit3.click();
        equalBtn.click();

        MobileElement result = driver.findElement(By.id("com.android.calculator:id/result_final"));
        String actualResult = result.getText();
        Assert.assertEquals("5",actualResult);



        Thread.sleep(3000);
        driver.closeApp();


    }
}
