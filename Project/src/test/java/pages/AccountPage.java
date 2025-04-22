package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.AccountPageLocators;
import uistore.GymGlovesPageLocators;
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
    public void sendInFirstName(){
        helper.clickOnElement(AccountPageLocators.firstname, "Clicked on Firstname");
        helper.sendData(AccountPageLocators.firstname, "muralidhar", "Sent value to firstname");
    }
    public void sendInLastName(){
        helper.clickOnElement(AccountPageLocators.lastname, "Clicked on ");
        helper.sendData(AccountPageLocators.lastname, "gym king", "Sent value to last name");
    }
    public void sendInEmail(){
        helper.clickOnElement(AccountPageLocators.email, "Clicked on email");
        helper.sendData(AccountPageLocators.email, "murafliderf@gmail.com", "Sent value to email");
    }
    public void sendInPassword(){
        helper.clickOnElement(AccountPageLocators.password, "Clicked on password");
        helper.sendData(AccountPageLocators.password, "Awhrbr@#$hvbfhvbi2434", "Sent value to password");
    }
    public void sendInConfirmPassword(){
        helper.clickOnElement(AccountPageLocators.confirmPassword, "Clicked on ");
        helper.sendData(AccountPageLocators.confirmPassword, "Awhrbr@#$hvbfhvbi2434", "Sent value to confirmpassword");
    }
    public void clickOnCreate(){
        helper.clickOnElement(AccountPageLocators.create, "Clicked on create");
    }
    public void verifyThankYou(){
        try {
            String data = helper.getText(AccountPageLocators.thankYou, "Verified Thank you message");
            Assert.assertTrue(data.contains("THANK YOU"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickONLogout(){
        helper.clickOnElement(AccountPageLocators.logout,"Clicked on logout");
    }
    public void backNavigate(){
        helper.navigateBack("Navigated Back");
    }
    public void sendInLoginEmail(){
        helper.sendData(AccountPageLocators.loginEmail, "test134@gmail.com", "Sent email in Login page");
    }
    public void sendInLoginPassword(){
        helper.sendData(AccountPageLocators.loginPassword, "test140@ga", "Sent password in Login page");
    }
    public void clickOnSignIn(){
        helper.clickOnElement(AccountPageLocators.signIn, "Clicked on signIn");
    }
    public void verifyErrorMessage(){
        try {
            String data = helper.getText(AccountPageLocators.errorMessage, "Verified Error Message");
            Assert.assertTrue(data.contains( "THE ACCOUNT SIGN-IN WAS INCORRECT OR YOUR ACCOUNT IS DISABLED"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void testCase2(){
        hoverOnLogin();
        clickOnLogin();
        clickOncreateAccount();
        sendInFirstName();
        sendInLastName();
        sendInEmail();
        sendInPassword();
        sendInConfirmPassword();
        clickOnCreate();
        clickONLogout();
        backNavigate();
        sendInLoginEmail();
        sendInLoginPassword();
        clickOnSignIn();
        verifyErrorMessage();
    }

}
