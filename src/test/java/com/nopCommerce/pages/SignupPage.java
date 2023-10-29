package com.nopCommerce.pages;

import com.nopCommerce.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    // SignUp Page
    @FindBy(css= "[class=\"ico-register\"]")
    private WebElement SignUp;

    // Personal Details
    @FindBy(css = "[id=\"gender-male\"]")
    private WebElement GenderMale;
    @FindBy(css = "[id=\"gender-female\"]")
    private WebElement GenderFemale;
    @FindBy(css = "[id=\"FirstName\"]")
    private WebElement FirstName;
    @FindBy(css = "[id=\"LastName\"]")
    private WebElement LastName;
    @FindBy(css = "[name=\"DateOfBirthDay\"]")
    private WebElement BirthDay;
    @FindBy(css = "[name=\"DateOfBirthMonth\"]")
    private WebElement BirthMonth;
    @FindBy(css = "[name=\"DateOfBirthYear\"]")
    private WebElement BirthYear;
    @FindBy(css = "[id=\"Email\"]")
    private WebElement Email;

    //Company Details

    @FindBy(css = "[id=\"Company\"]")
    private WebElement CompanyName;

    // Password
    @FindBy(css = "[id=\"Password\"]")
    private WebElement Password;
    @FindBy(css = "[id=\"ConfirmPassword\"]")
    private WebElement ConfirmPassword;
    @FindBy(css = "[id=\"register-button\"]")
    private WebElement submit;

    //Method for create user Female
    public void SignupF(String firstname, String lastname, String day, String month, String year, String email, String company, String password, String confirmpass) {
            GenderFemale.click();
            FirstName.sendKeys(firstname);
            LastName.sendKeys(lastname);
            BirthDay.sendKeys(day);
            BirthMonth.sendKeys(month);
            BirthYear.sendKeys(year);
            Email.sendKeys(email);
            CompanyName.sendKeys(company);
            Password.sendKeys(password);
            ConfirmPassword.sendKeys(confirmpass);
            submit.click();
    }

    //Method for create user Male
    public void SignupM(String firstname, String lastname, String day, String month, String year, String email, String company, String password, String confirmpass) {
        GenderFemale.click();
        FirstName.sendKeys(firstname);
        LastName.sendKeys(lastname);
        BirthDay.sendKeys(day);
        BirthMonth.sendKeys(month);
        BirthYear.sendKeys(year);
        Email.sendKeys(email);
        CompanyName.sendKeys(company);
        Password.sendKeys(password);
        ConfirmPassword.sendKeys(confirmpass);
        submit.click();
    }

    // Messages validation
    @FindBy(css = "[class=\"result\"]")
    private WebElement SuccessMessage;
    @FindBy(css = "[class=\"buttons\"]")
    private WebElement Continue;
    @FindBy(css = "[class=\"message-error validation-summary-errors\"]")
    private WebElement EmailValidation;
    @FindBy(css = "[class=\"field-validation-error\"]")
    private WebElement NotMatchPassword;

    public String SuccessMessage() {
        return SuccessMessage.getText();

    }
    public void Continue() {
        Continue.click();
    }
    public String emailAlreadyExists() {
        return EmailValidation.getText();
    }
    public String notMatchPawssword() {
        return NotMatchPassword.getText();
    }

    public void SignUp() {
        SignUp.click();
    }

}