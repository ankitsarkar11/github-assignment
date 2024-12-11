package com.github.qa.uitests.templates;

import com.github.qa.uitests.pages.template.AbstractPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractUITest extends AbstractPage{
    protected AbstractUITest() {
        super("");
    }
    @BeforeClass
    public void driverSetUp() {
        startBrowser();
    }
    @AfterClass
    public void driverCleanUp() throws InterruptedException {
        Thread.sleep(30000);
        quitBrowser();
    }
    public void open(){}
}
