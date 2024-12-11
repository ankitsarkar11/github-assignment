package com.github.qa.uitests.pages;

import com.github.qa.uitests.pages.template.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class HomePage extends AbstractPage {
    private final By emailField=By.xpath("//input[@name='user_email' and @type='email']");
    private final By signUpButton=By.xpath("//button[@type='submit']//span[contains(text(),'Sign up for GitHub')]");
    private final By signInButton=By.xpath("//a[@href='/login' and contains(text(), 'Sign in')]/parent::div[contains(@class, 'HeaderMenu-link-wrap')]");

    public HomePage() {
        super("/");
    }
    public void enterEmail(String email) {
        enterElement(10, emailField, email);
    }
    public void clickOnSignUpForGithubButton() {
        clickElement(10, signUpButton);
    }
    public void clickOnSignInButton() {
        clickElement(10, signInButton);
    }
}
