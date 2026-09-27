package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class AttendancePage {

    private AndroidDriver driver;

    private By orgAttendance =
            By.xpath("//*[@text='Org attendance']");

    private By team =
            By.xpath("//*[@text='Team']");

    private By me =
            By.xpath("//*[@text='Me']");

    private By in =
            By.xpath("//*[@text='In']");

    private By late =
            By.xpath("//*[@text='Late']");

    private By leave =
            By.xpath("//*[@text='Leave']");

    private By absent =
            By.xpath("//*[@text='Absent']");

    private By present =
            By.xpath("//*[@text='Present']");

    public AttendancePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public boolean isOrgAttendanceDisplayed() {

        return driver.findElement(orgAttendance).isDisplayed();
    }

    public boolean isTeamDisplayed() {

        return driver.findElement(team).isDisplayed();
    }

    public boolean isMeDisplayed() {

        return driver.findElement(me).isDisplayed();
    }

    public boolean isInDisplayed() {

        return driver.findElement(in).isDisplayed();
    }

    public boolean isLateDisplayed() {

        return driver.findElement(late).isDisplayed();
    }

    public boolean isLeaveDisplayed() {

        return driver.findElement(leave).isDisplayed();
    }

    public boolean isAbsentDisplayed() {

        return driver.findElement(absent).isDisplayed();
    }

    public boolean isPresentDisplayed() {

        return driver.findElement(present).isDisplayed();
    }
}