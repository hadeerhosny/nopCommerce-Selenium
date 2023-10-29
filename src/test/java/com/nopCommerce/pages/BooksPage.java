package com.nopCommerce.pages;

import com.nopCommerce.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage extends BasePage {


    public BooksPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "[href=\"/books\"]")
    private WebElement Books;
    @FindBy(css = "[id=\"products-orderby\"]")
    private WebElement Sorting;
    @FindBy(css = "[value=\"10\"]")
    private WebElement LowToHigh;


    /*WebElement productsListElement = driver.findElement(By.className("products-list"));
    List<WebElement> productsElements = productsListElement.findElements(By.className("product"));
    WebElement selectedProductElement = productsElements.get(1);*/
    @FindBy(css = "[onclick=\"return AjaxCart.addproducttocart_catalog(&quot;/addproducttocart/catalog/37/1/1&quot;),!1\"]")
    private WebElement AddToCartProduct;
    @FindBy(css = "[class=\"ico-cart\"]")
    private WebElement ShowCart;
    @FindBy(css = "[id=\"termsofservice\"]")
    private WebElement AgreeTearms;
    @FindBy(css = "[id=\"checkout\"]")
    private WebElement Checkout;

    public void selectOrderTobuy() {
        Books.click();
        Sorting.click();
        LowToHigh.click();
        AddToCartProduct.click();
        ShowCart.click();
        AgreeTearms.click();
        Checkout.click();

    }

    public void getBooks() {
        Books.click();
    }
    public void getSorting() {
        Sorting.click();
    }
    public void getProductFromLtoH() {
        LowToHigh.click();
    }

    public void showMyCart() {
        ShowCart.click();
    }
    public void agreeTermsAndCondations() {
        AgreeTearms.click();
    }
    public void checkOutOrder() {
        Checkout.click();
    }


    //....................................................................................................................
    //...................................................... CheckOut Details.............................................
    //....................................................................................................................

    @FindBy(css= "[id=\"BillingNewAddress_CountryId\"]")
    private WebElement Country;
    @FindBy(css= "[value=\"123\"]")
    private WebElement SelectEgypt;
    @FindBy(css= "[id=\"BillingNewAddress_City\"]")
    private WebElement City;
    @FindBy(css= "[id=\"BillingNewAddress_Address1\"]")
    private WebElement Address1;
    @FindBy(css= "[id=\"BillingNewAddress_ZipPostalCode\"]")
    private WebElement ZIP;
    @FindBy(css= "[id=\"BillingNewAddress_PhoneNumber\"]")
    private WebElement MobileNumber;
    @FindBy(css= "[class=\"button-1 new-address-next-step-button\"]")
    private WebElement ContinueButton1;
    @FindBy(css= "[class=\"button-1 shipping-method-next-step-button\"]")
    private WebElement ContinueButton2;
    @FindBy(css= "[class=\"button-1 payment-method-next-step-button\"]")
    private WebElement ContinueButton3;
    @FindBy(css= "[class=\"button-1 payment-info-next-step-button\"]")
    private WebElement ContinueButton4;
    @FindBy(css= "[class=\"button-1 confirm-order-next-step-button\"]")
    private WebElement ConfirmButton;
    @FindBy(css= "[class=\"title\"]")
    private WebElement SuccessOrder;
    @FindBy(css= "[class=\"order-number\"]")
    private WebElement OrderNumber;

    //Methods
    public void setOrderDetails(String city, String address1, String zip, String mobile) {
        Country.click();
        SelectEgypt.click();
        City.sendKeys(city);
        Address1.sendKeys(address1);
        ZIP.sendKeys(zip);
        MobileNumber.sendKeys(mobile);
        ContinueButton1.click();
        ContinueButton2.click();
        ContinueButton3.click();
        ContinueButton4.click();
        ConfirmButton.click();
    }
    public String successMessageForCompeleteOrder() {
        return SuccessOrder.getText();
    }
    public String orderNumber() {
        return OrderNumber.getText();
    }


}
