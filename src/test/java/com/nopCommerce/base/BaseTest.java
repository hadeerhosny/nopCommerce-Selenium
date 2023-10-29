package com.nopCommerce.base;

import com.nopCommerce.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new DriverFactory().initialization();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
