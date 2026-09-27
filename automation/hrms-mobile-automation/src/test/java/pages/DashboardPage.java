package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class DashboardPage {

    private AndroidDriver driver;
    private WebDriverWait wait;

    private By home =
            By.xpath("//*[@text='Home']");

    private By attendance =
            By.xpath("//*[@text='Attendance']");

    private By approvals =
            By.xpath("//*[@text='Approvals']");

    private By directory =
            By.xpath("//*[@text='Directory']");

    private By profile =
            By.xpath("//*[@text='Profile']");

    public DashboardPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean isHomeDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(home)
        ).isDisplayed();
    }

    public boolean isAttendanceDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(attendance)
        ).isDisplayed();
    }

    public boolean isApprovalsDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(approvals)
        ).isDisplayed();
    }

    public boolean isDirectoryDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(directory)
        ).isDisplayed();
    }

    public boolean isProfileDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(profile)
        ).isDisplayed();
    }

    public void clickAttendance() {

        By attendanceButton =
                By.xpath("//*[@text='Attendance']");

        wait.until(
                ExpectedConditions.elementToBeClickable(attendanceButton)
        ).click();
    }
}