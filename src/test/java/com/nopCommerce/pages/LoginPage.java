package com.nopCommerce.pages;

import com.nopCommerce.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css= "[class=\"ico-login\"]")
    private WebElement LogIn;
    @FindBy(css= "[class=\"email\"]")
    private WebElement EmailLogin;
    @FindBy(css= "[class=\"password\"]")
    private WebElement PassLogin;
    @FindBy(css = "[class=\"button-1 login-button\"]")
    private WebElement Login;
    @FindBy(css = "[class=\"ico-logout\"]")
    private WebElement logout;
    @FindBy(css = "[class=\"message-error validation-summary-errors\"]")
    private  WebElement InvalidEmail;

    public void Login(String email, String password) {
        LogIn.click();
        EmailLogin.sendKeys(email);
        PassLogin.sendKeys(password);
        Login.click();
    }

    public void LogOut() {
        logout.getText();
    }
    public void inValidEmail() {
        InvalidEmail.getText();
    }


}
