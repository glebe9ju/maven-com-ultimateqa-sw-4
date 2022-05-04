package com.ultimateqa.testsuite;

import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginpageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage signInPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not verify Message");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        signInPage.enterEmailId("prime123@gmail.com");
        signInPage.enterPassword("prime123");
        signInPage.clickOnLogingButton();
        String expectedErrorMessage = "Invalid email or password.";

        String actualErrorMessage = signInPage.getErrorMessage();
//        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Erroor message not displayed");

    }
}
