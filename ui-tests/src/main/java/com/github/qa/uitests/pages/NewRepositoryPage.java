package com.github.qa.uitests.pages;

import com.github.qa.uitests.pages.template.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class NewRepositoryPage extends AbstractPage {
    By emailField = By.xpath("//input[@id='email' and @type='email']");
    By emailContinueButton = By.xpath("//input[@id='email' and @type='email']/ancestor::div[1]/../button[contains(text(),'Continue')]");
    By passwordField = By.xpath("//input[@id='password' and @type='password']");
    By passwordContinueButton = By.xpath("//input[@id='password' and @type='password']/ancestor::div[1]/../button[contains(text(),'Continue')]");
    By usernameField = By.xpath("//input[@id='login' and @type='text']");
    By usernameContinueButton = By.xpath("//input[@id='login' and @type='text']/ancestor::div[1]/../button[contains(text(),'Continue')]");
    By emailErrorField = By.xpath("//p[@id='email-err']/p");
    By passwordErrorField = By.xpath("//p[@id='password-err']/p[1]");

    public NewRepositoryPage() {
        super("/new");
    }


}
