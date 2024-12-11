package com.github.qa.uitests.pages;

import com.github.qa.shared.utils.Properties;
import com.github.qa.uitests.pages.template.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class LoginPage extends AbstractPage {
    By loginField=By.xpath("//input[@id='login_field' and @type='text']");
    By passwordField=By.xpath("//input[@id='password' and @type='password']");
    By signInButton=By.xpath("//input[@type='submit' and @value='Sign in']");
    By errorAlertBox=By.xpath("//div[@role='alert' and contains(@class, 'js-flash-alert')]");

    public LoginPage() {
        super("/login");
    }

    public void enterLoginField(Object login) {
        enterElement(10, loginField, login);
    }

    public void clearLoginField() {
        clearElement(10, loginField);
    }

    public void enterPasswordField(Object password) {
        enterElement(10, passwordField, password);
    }

    public void clickOnSignInButton() {
        clickElement(10, signInButton);
    }

    public String getErrorAlertText() {
        return getElementText(10, errorAlertBox);
    }

    public void loginWithDefaultUser() {
        enterLoginField(Properties.USER_EMAIL.value());
        enterPasswordField(Properties.USER_PASSWORD.value());
        clickOnSignInButton();
    }

}
