package com.github.qa.uitests.pages;

import com.github.qa.uitests.pages.template.AbstractPage;
import org.openqa.selenium.By;

public class DashboardPage extends AbstractPage {
    By newRepositoryButton = By.xpath("//a[@href='/new' and contains(@class,'Button--primary')]");

    public DashboardPage() {
        super("/dashboard");
    }

    public Boolean isDashboardPage() {
        return isTitle(5, "GitHub");
    }

    public void clickOnNewRepositoryButton() {
        clickElement(10, newRepositoryButton);
    }
}
