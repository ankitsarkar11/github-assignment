package com.github.qa.uitests.pages;

import com.github.qa.uitests.pages.template.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class SignUpPage extends AbstractPage {
    By emailField = By.xpath("//input[@id='email' and @type='email']");
    By emailContinueButton = By.xpath("//input[@id='email' and @type='email']/ancestor::div[1]/../button[contains(text(),'Continue')]");
    By passwordField = By.xpath("//input[@id='password' and @type='password']");
    By passwordContinueButton = By.xpath("//input[@id='password' and @type='password']/ancestor::div[1]/../button[contains(text(),'Continue')]");
    By usernameField = By.xpath("//input[@id='login' and @type='text']");
    By usernameContinueButton = By.xpath("//input[@id='login' and @type='text']/ancestor::div[1]/../button[contains(text(),'Continue')]");
    By emailErrorField = By.xpath("//p[@id='email-err']/p");
    By passwordErrorField = By.xpath("//p[@id='password-err']/p[1]");

    public SignUpPage() {
        super("/signup");
    }

    public void enterEmailField(Object email) {
        enterElement(10, emailField, email);
    }

    public void clearEmailField() {
        clearElement(10, emailField);
    }

    public Boolean isEmailContinueButtonEnabled() {
        return checkElementEnabled(10, emailContinueButton);
    }

    public void clickEmailContinueButton() {
        clickElement(10, emailContinueButton);
    }

    public String getEmailErrorText() {
        return getElementText(10, emailErrorField);
    }

    public void enterPasswordField(Object password) {
        enterElement(10, passwordField, password);
    }

    public void clearPasswordField() {
        clearElement(10, passwordField);
    }

    public Boolean isPasswordContinueButtonEnabled() {
        return checkElementEnabled(10, passwordContinueButton);
    }

    public String getPasswordErrorText() {
        return getElementText(10, passwordErrorField);
    }

    public void clickPasswordContinueButton() {
        clickElement(10, passwordContinueButton);
    }

    public void enterUsernameField(Object username) {
        enterElement(10, usernameField, username);
    }

    public Boolean isUsernameContinueButtonEnabled() {
        return checkElementEnabled(10, usernameContinueButton);
    }

    public void clickUsernameContinueButton() {
        clickElement(10, usernameContinueButton);
    }
}
