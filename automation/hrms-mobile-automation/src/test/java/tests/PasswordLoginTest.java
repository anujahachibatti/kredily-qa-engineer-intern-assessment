package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.PasswordPage;

public class PasswordLoginTest extends BaseTest {

    @Test
    public void validPasswordLoginTest() {

        PasswordPage passwordPage = new PasswordPage(driver);

        // Use an authorized test account password
        passwordPage.enterPassword("YOUR_TEST_PASSWORD");

        // Click Sign in
        passwordPage.clickSignIn();

        // Wait for application to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Verify application is still running
        Assert.assertEquals(
                driver.getCurrentPackage(),
                "com.kredily.mobile",
                "Kredily application should remain active"
        );

        System.out.println("Password login test executed successfully.");
    }
}