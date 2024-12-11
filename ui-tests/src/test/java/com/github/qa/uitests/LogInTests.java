package com.github.qa.uitests;

import com.github.qa.shared.utils.Properties;
import com.github.qa.uitests.pages.DashboardPage;
import com.github.qa.uitests.pages.HomePage;
import com.github.qa.uitests.pages.LoginPage;
import com.github.qa.uitests.pages.SignUpPage;
import com.github.qa.uitests.templates.AbstractUITest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class LogInTests extends AbstractUITest {
    @Test
    public void testValidLogin() {
        HomePage homePage=new HomePage();
        homePage.openPage();
        homePage.clickOnSignInButton();
        LoginPage loginPage=new LoginPage();
        loginPage.enterLoginField(Properties.USER_EMAIL.value());
        loginPage.enterPasswordField(Properties.USER_PASSWORD.value());
        loginPage.clickOnSignInButton();
        Assert.assertTrue(new DashboardPage().isDashboardPage());
    }
    @Test
    public void testInvalidLogin() {
        LoginPage loginPage=new LoginPage();
        loginPage.openPage();
        loginPage.enterLoginField("invalidemail@hdhddj.com");
        loginPage.enterPasswordField("test733737711");
        loginPage.clickOnSignInButton();
        Assert.assertEquals(
                loginPage.getErrorAlertText().trim(), "Incorrect username or password."
        );
    }

}
