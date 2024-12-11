package com.github.qa.uitests;

import com.github.qa.uitests.pages.HomePage;
import com.github.qa.uitests.pages.SignUpPage;
import com.github.qa.uitests.templates.AbstractUITest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.UUID;

public class SignUpTests extends AbstractUITest {
    @Test
    public void testSignUp() {
        HomePage homePage=new HomePage();
        homePage.openPage();
        homePage.enterEmail("hello@hello.in");
        homePage.clickOnSignUpForGithubButton();
        SignUpPage signUpPage=new SignUpPage();
        signUpPage.clickEmailContinueButton();
        signUpPage.enterPasswordField(UUID.randomUUID().toString());
        signUpPage.clickPasswordContinueButton();
        signUpPage.enterUsernameField("helloUser"+UUID.randomUUID().toString().substring(0,5));
        signUpPage.clickUsernameContinueButton();
        //can't continue because of captcha
    }
    @Test
    public void testEmailField() {
        //positive case
        SignUpPage signUpPage=new SignUpPage();
        signUpPage.openPage();
        signUpPage.enterEmailField("validemail123@hello.com");
        Assert.assertFalse(
                signUpPage.isEmailContinueButtonEnabled()
        );
        //check empty field
        signUpPage.clearEmailField();
        signUpPage.enterEmailField(Keys.ENTER);
        Assert.assertFalse(
                signUpPage.isEmailContinueButtonEnabled()
        );
        //check with invalid email
        signUpPage.enterEmailField("invalidEmail");
        signUpPage.enterEmailField(Keys.ENTER);
        Assert.assertEquals(
                signUpPage.getEmailErrorText().trim(),
                "Email is invalid or already taken"
        );
        Assert.assertFalse(
                signUpPage.isEmailContinueButtonEnabled()
        );
    }
    @Test
    public void testPasswordField() {
        SignUpPage signUpPage=new SignUpPage();
        signUpPage.openPage();
        signUpPage.enterEmailField("validemail123@hello.com");
        signUpPage.clickEmailContinueButton();
        Assert.assertFalse(
                signUpPage.isPasswordContinueButtonEnabled()
        );
        signUpPage.enterPasswordField("123");
        signUpPage.enterPasswordField(Keys.ENTER);
        Assert.assertEquals(
                signUpPage.getPasswordErrorText().trim(),
                "Password is too short"
        );
        Assert.assertFalse(
                signUpPage.isPasswordContinueButtonEnabled()
        );
        signUpPage.clearPasswordField();
        signUpPage.enterPasswordField(Keys.ENTER);
        Assert.assertFalse(
                signUpPage.isPasswordContinueButtonEnabled()
        );
    }

}
