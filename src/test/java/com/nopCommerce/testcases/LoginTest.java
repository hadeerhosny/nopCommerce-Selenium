package com.nopCommerce.testcases;

import com.nopCommerce.base.BaseTest;
import com.nopCommerce.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    @Test
    public void shouldAbleToLogIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("hadeerhosny@gmail.com", "123456");
        loginPage.LogOut();
        Assert.assertEquals(loginPage, "Log out");
    }

    @Test
    public void shouldNotAbleLoginWhenEnterInValidEmail() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("hadeer@yahoo.com", "123456");
        loginPage.inValidEmail();
        Assert.assertEquals(loginPage, "Login was unsuccessful. Please correct the errors and try again.");
    }
}
