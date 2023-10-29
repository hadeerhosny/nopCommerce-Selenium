package com.nopCommerce.testcases;

import com.nopCommerce.base.BaseTest;
import com.nopCommerce.pages.BooksPage;
import com.nopCommerce.pages.LoginPage;
import com.nopCommerce.pages.SignupPage;
import com.shaft.driver.SHAFT;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllcasesTest extends BaseTest {

    SHAFT.GUI.WebDriver Browser = new SHAFT.GUI.WebDriver();
    SignupPage signupPage;
    LoginPage loginPage;
    BooksPage booksPage;
    @Test
    public void buyTheProduct() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.SignUp();
        signupPage.SignupF("Hadeer", "Hosny", "19", "September", "1996", "Hadeerhosny018@gmail.com", "Fawry", "Had@123", "Had@123");
        signupPage.Continue();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("Hadeerhosny018@gmail.com", "Had@123");
        BooksPage booksPage = new BooksPage(driver);
        booksPage.selectOrderTobuy();
        booksPage.setOrderDetails("cairo", "new cairo", "135711", "01012588934");
        String ActualResult = booksPage.successMessageForCompeleteOrder();
        Assert.assertEquals(ActualResult, "Your order has been successfully processed!");
    }



}
