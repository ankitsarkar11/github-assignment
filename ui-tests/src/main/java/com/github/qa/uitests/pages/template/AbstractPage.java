package com.github.qa.uitests.pages.template;

import com.github.qa.shared.utils.Properties;
import com.github.qa.uitests.utils.Config;
import com.github.qa.uitests.utils.Wait;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Objects;
import java.util.Optional;

public abstract class AbstractPage {
    public static WebDriver driver;
    public String path;
    private static final long IMPLICIT_TIMEOUT_SECONDS=30;

    protected AbstractPage(String path) {
        this.path=path;
    }

    public void openPage() {
        openPage(Properties.GITHUB_UI_BASE_URL.value()+path);
    }

    protected void openPage(String url) {
        driver.get(url);
    }
    protected void quitBrowser() {
        driver.quit();
    }
    protected void startBrowser() {
        switch(Config.get("browser").toLowerCase()) {
            case "chrome":
                driver=Optional.ofNullable(driver).orElse(Browsers.CHROME.getDriverSupplier().get());
                break;
            case "firefox":
                driver=Optional.ofNullable(driver).orElse(Browsers.FIREFOX.getDriverSupplier().get());
                break;
            default:
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT_SECONDS));
        driver.manage().window().maximize();
    }
    protected WebElement getElement(long waitSeconds, By locator) {
        return new Wait(Duration.ofSeconds(waitSeconds))
                .elementToBeClickable(locator);
    }
    protected void enterElement(long waitSeconds, By locator, Object data) { //takes object (string/Keys)
        new Wait(Duration.ofSeconds(waitSeconds))
                .visibilityOfElementLocated(locator)
                .sendKeys(data instanceof String ? (String) data : (Keys)data);
    }
    protected void clearElement(long waitSeconds, By locator) { //takes object (string/Keys)
        new Wait(Duration.ofSeconds(waitSeconds))
                .visibilityOfElementLocated(locator)
                .clear();
    }
    protected void clickElement(long waitSeconds, By locator) {
        new Wait(Duration.ofSeconds(waitSeconds))
                .elementToBeClickable(locator)
                .click();
    }
    protected Boolean checkElementEnabled(long waitSeconds, By locator) {
        return new Wait(Duration.ofSeconds(waitSeconds))
                .visibilityOfElementLocated(locator)
                .isEnabled();
    }
    protected String getElementText(long waitSeconds, By locator) {
        return new Wait(Duration.ofSeconds(waitSeconds))
                .elementToBeClickable(locator)
                .getText();
    }
    @SneakyThrows
    protected Boolean isTitle(long waitSeconds, String title) {
        for(int i=0;i<10;i++) {
            if(!Objects.equals(driver.getTitle(), title)) {
                Thread.sleep(waitSeconds*1000);
            } else {
                return true;
            }
        }
        return false;
    }
}
