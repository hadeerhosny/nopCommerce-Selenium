package com.nopCommerce.testcases;

import com.nopCommerce.base.BaseTest;
import com.nopCommerce.pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SignupTest extends BaseTest {

    SignupPage signupPage;

    @Test
    public void ShouldBeAbleToSignUp() throws Exception{
        SignupPage signupPage =new SignupPage(driver);
        signupPage.SignUp();
        signupPage.SignupF("Hadeer", "Hosny", "19", "September", "1996", getSaltString()+"@gmail.com", "Fawry", "Had@123", "Had@123");
        String ActualResult = signupPage.SuccessMessage();
        Assert.assertEquals(ActualResult, "Your registration completed");
        signupPage.Continue();
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    @Test
    public void notSignUpByTheSameEmail() {
        SignupPage signupPage =new SignupPage(driver);
        signupPage.SignUp();
        signupPage.SignupF("Hadeer", "Hosny", "19", "September", "1996", "Hadeerhosny019@gmail.com", "Fawry", "Had@123", "Had@123");
        signupPage.Continue();
        signupPage.SignUp();
        signupPage.SignupF("Hadeer", "Hosny", "19", "September", "1996", "Hadeerhosny019@gmail.com", "Fawry", "Had@123", "Had@123");
        String ActualResult = signupPage.emailAlreadyExists();
        Assert.assertEquals(ActualResult, "The specified email already exists");
    }

    @Test
    public void notSignWhenPasswordAndConfirmPassNotMatch() {
        SignupPage signupPage =new SignupPage(driver);
        signupPage.SignUp();
        signupPage.SignupF("Hadeer", "Hosny", "19", "September", "1996", "Hadeerhosny019@gmail.com", "Fawry", "Had@123", "Had@111");
        String ActualResult = signupPage.notMatchPawssword();
        Assert.assertEquals(ActualResult, "The password and confirmation password do not match.");
    }
}
