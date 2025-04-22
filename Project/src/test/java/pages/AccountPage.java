package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.AccountPageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class AccountPage {
    ExtentTest test;
    WebDriverHelper helper;
    public AccountPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
    }

    public void hoverOnLogin(){
        helper.hoverOverElement(AccountPageLocators.loginIcon, "Hovered on Login");
    }
    public void clickOnLogin(){
        helper.clickOnElement(AccountPageLocators.loginButton, "Clicked on LOG IN");
    }
    public void clickOncreateAccount(){
        helper.clickOnElement(AccountPageLocators.createAccount, "Clicked on create Account");
    }
    public void sendInEmail(){
        helper.clickOnElement(AccountPageLocators.email, "Clicked on email");
        helper.sendData(AccountPageLocators.email, "murali@gmail.com", "Sent value to email");
    }
    public void sendInFirst(){
        helper.clickOnElement(AccountPageLocators., "Clicked on ");
        helper.sendData(AccountPageLocators., "murali@gmail.com", "Sent value to email");
    }
}
