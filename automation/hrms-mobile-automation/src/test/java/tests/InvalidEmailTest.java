package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PasswordPage;

public class InvalidEmailTest extends BaseTest {


    @Test
    public void invalidEmailTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("snc@gmail.com");

        loginPage.clickSignInWithPassword();
        
        PasswordPage passwordPage = new PasswordPage(driver);

    	passwordPage.enterPassword("Pass@9865");

    	passwordPage.clickSignIn();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Assert.assertTrue(
            driver.getPageSource().contains(
                "No account found with this email or mobile number."
            ),
            "Expected invalid email error message was not displayed"
        );

        System.out.println("TC02 - Invalid Email PASSED");
    }
}