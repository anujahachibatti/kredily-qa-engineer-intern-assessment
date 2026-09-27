package pages;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

    private AndroidDriver driver;

    // Email / Mobile field
    private By emailField =
            By.xpath("//android.widget.EditText");

    // Continue button
    private By continueButton =
            By.xpath("//*[@text='Sign in with password']");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Enter email
    public void enterEmail(String email) {

        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    // Click Continue
    public void clickSignInWithPassword() {

        driver.findElement(continueButton).click();
    }
}