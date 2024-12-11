package com.github.qa.uitests;

import com.github.qa.uitests.pages.DashboardPage;
import com.github.qa.uitests.pages.LoginPage;
import com.github.qa.uitests.templates.AbstractUITest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTests extends AbstractUITest {
    @Test
    public void createNewRepositoryTest() {
        LoginPage loginPage=new LoginPage();
        loginPage.openPage();
        loginPage.loginWithDefaultUser();
        DashboardPage dashboardPage=new DashboardPage();
        Assert.assertTrue(dashboardPage.isDashboardPage());
        dashboardPage.clickOnNewRepositoryButton();
    }
}
