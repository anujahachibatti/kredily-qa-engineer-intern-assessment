package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PasswordPage;

public class DashboardTest extends BaseTest {

    @Test
    public void dashboardValidationTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("peoplekredily1@yopmail.com");

        loginPage.clickSignInWithPassword();

        PasswordPage passwordPage = new PasswordPage(driver);

        passwordPage.enterPassword("Pass@9865");
        passwordPage.clickSignIn();

        // Wait for Dashboard
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Dashboard validation
        DashboardPage dashboard = new DashboardPage(driver);

        Assert.assertTrue(
                dashboard.isHomeDisplayed(),
                "Home should be displayed"
        );

        Assert.assertTrue(
                dashboard.isAttendanceDisplayed(),
                "Attendance should be displayed"
        );

        Assert.assertTrue(
                dashboard.isApprovalsDisplayed(),
                "Approvals should be displayed"
        );

        Assert.assertTrue(
                dashboard.isDirectoryDisplayed(),
                "Directory should be displayed"
        );

        Assert.assertTrue(
                dashboard.isProfileDisplayed(),
                "Profile should be displayed"
        );

        System.out.println("TC04 - Dashboard Validation PASSED");
    }
}