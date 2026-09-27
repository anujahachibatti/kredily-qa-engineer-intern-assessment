
package base;

import java.net.URI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");

        // Physical Android phone
        options.setDeviceName("RZCT41FAZHW");

        // Kredily application
        options.setAppPackage("com.kredily.mobile");
        options.setAppActivity(".MainActivity");

        // Give Appium more time to install UiAutomator2
        options.setCapability(
                "appium:uiautomator2ServerInstallTimeout",
                120000
        );

        driver = new AndroidDriver(
                URI.create("http://127.0.0.1:4723").toURL(),
                options
        );

        System.out.println("Kredily application launched successfully.");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

        System.out.println("Appium session closed.");
    }
}