package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

    protected AndroidDriver driver;

    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Android
        capabilities.setCapability("platformName", "Android");

        // Appium automation engine
        capabilities.setCapability(
                "appium:automationName",
                "UiAutomator2"
        );

        // Android emulator name
        capabilities.setCapability(
                "appium:deviceName",
                "emulator-5554"
        );

        // Your HRMS application package
        capabilities.setCapability(
                "appium:appPackage",
                "YOUR_APP_PACKAGE"
        );

        // Your HRMS application's main activity
        capabilities.setCapability(
                "appium:appActivity",
                "YOUR_APP_ACTIVITY"
        );

        // Connect to Appium server
        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                capabilities
        );
    }

    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}