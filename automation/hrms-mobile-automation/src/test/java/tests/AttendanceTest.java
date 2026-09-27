package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AttendancePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PasswordPage;

public class AttendanceTest extends BaseTest {

    @Test
    public void attendanceValidationTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("peoplekredily1@yopmail.com");

        loginPage.clickSignInWithPassword();

        // Password
        PasswordPage passwordPage = new PasswordPage(driver);

        passwordPage.enterPassword("Pass@9865");

        passwordPage.clickSignIn();

        // Dashboard
        DashboardPage dashboard = new DashboardPage(driver);

        // Wait until Home is visible
        Assert.assertTrue(
                dashboard.isHomeDisplayed(),
                "Dashboard Home was not displayed"
        );

        System.out.println("Dashboard loaded successfully.");

        // Click Attendance
        dashboard.clickAttendance();

        System.out.println("Attendance clicked.");

        // Attendance page
        AttendancePage attendance = new AttendancePage(driver);

        Assert.assertTrue(
                attendance.isOrgAttendanceDisplayed(),
                "Org attendance page was not displayed"
        );

        Assert.assertTrue(
                attendance.isTeamDisplayed(),
                "Team tab was not displayed"
        );

        Assert.assertTrue(
                attendance.isMeDisplayed(),
                "Me tab was not displayed"
        );

        Assert.assertTrue(
                attendance.isInDisplayed(),
                "In status was not displayed"
        );

        Assert.assertTrue(
                attendance.isLateDisplayed(),
                "Late status was not displayed"
        );

        Assert.assertTrue(
                attendance.isLeaveDisplayed(),
                "Leave status was not displayed"
        );

        Assert.assertTrue(
                attendance.isAbsentDisplayed(),
                "Absent status was not displayed"
        );

        Assert.assertTrue(
                attendance.isPresentDisplayed(),
                "Present status was not displayed"
        );

        System.out.println("TC05 - Attendance Validation PASSED");
    }
}