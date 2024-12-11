package com.github.qa.apitests.template;

import com.github.qa.shared.utils.Properties;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public abstract class AbstractTest {
    protected SoftAssert assertThat;
    protected String token= Properties.ACCESS_TOKEN.value();
    @BeforeMethod
    public void beforeMethod() {
        assertThat=new SoftAssert();
    }
}
