package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PasswordPage;

public class InvalidPasswordTest extends BaseTest {

    @Test
    public void invalidPasswordTest() {

        // Login screen
        LoginPage loginPage = new LoginPage(driver);

        // Valid registered email
        loginPage.enterEmail("peoplekredily1@yopmail.com");

        // Click Continue
        loginPage.clickSignInWithPassword();

        // Now password screen should appear
        PasswordPage passwordPage = new PasswordPage(driver);

        // Enter WRONG password
        passwordPage.enterPassword("WrongPassword@123");

        // Click Sign in
        passwordPage.clickSignIn();

        // Wait for error
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Verify error message
        Assert.assertTrue(
            driver.getPageSource().contains("Incorrect password"),
            "Expected invalid password error was not displayed"
        );

        System.out.println("TC03 - Invalid Password PASSED");
    }
}