package com.github.qa.uitests.pages.template;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

@Getter
public enum Browsers {
    CHROME(ChromeDriver::new),
    FIREFOX(FirefoxDriver::new);

    private final Supplier<WebDriver> driverSupplier;

    Browsers(Supplier<WebDriver> driverSupplier) {
        this.driverSupplier = driverSupplier;
    }
}
