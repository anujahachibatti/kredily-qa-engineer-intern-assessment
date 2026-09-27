package pages;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class PasswordPage {

    private AndroidDriver driver;

    private By passwordField =
            By.xpath("//android.widget.EditText");

    private By signInButton =
            By.xpath("//*[@text='Sign in']");

    public PasswordPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void enterPassword(String password) {

        driver.findElement(passwordField)
              .clear();

        driver.findElement(passwordField)
              .sendKeys(password);
    }

    public void clickSignIn() {

        driver.findElement(signInButton).click();
    }
}