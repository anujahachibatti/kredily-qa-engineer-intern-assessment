package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PasswordPage;
import pages.DashboardPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        // Login screen
        LoginPage loginPage = new LoginPage(driver);

        // Enter valid email
        loginPage.enterEmail("peoplekredily1@yopmail.com");

        // Click Continue
        loginPage.clickSignInWithPassword();

        // Password screen
        PasswordPage passwordPage = new PasswordPage(driver);

        // Enter valid password
        passwordPage.enterPassword("Pass@9865");

        // Click Sign in
        passwordPage.clickSignIn();

        // Wait for Dashboard
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Dashboard validation
        DashboardPage dashboard = new DashboardPage(driver);

        Assert.assertTrue(
                dashboard.isHomeDisplayed(),
                "Home should be displayed after successful login"
        );

        System.out.println("TC01 - Valid Login PASSED");
    }
}