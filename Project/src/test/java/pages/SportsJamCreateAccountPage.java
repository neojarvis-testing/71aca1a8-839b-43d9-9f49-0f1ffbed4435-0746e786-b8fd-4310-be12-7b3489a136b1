package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamCreateAccountPageLocators;
import uistore.SportsJamGymGlovesPageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class SportsJamCreateAccountPage {
    ExtentTest test;
    WebDriverHelper helper;
    public SportsJamCreateAccountPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
    }

    public void hoverOnLogin(){
        helper.hoverOverElement(SportsJamCreateAccountPageLocators.loginIcon, "Hovered on Login");
    }
    public void clickOnLogin(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.loginButton, "Clicked on LOG IN");
    }
    public void clickOncreateAccount(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.createAccount, "Clicked on create Account");
    }
    public void sendInFirstName(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.firstname, "Clicked on Firstname");
        helper.sendData(SportsJamCreateAccountPageLocators.firstname, "muralidhar", "Sent value to firstname");
    }
    public void sendInLastName(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.lastname, "Clicked on ");
        helper.sendData(SportsJamCreateAccountPageLocators.lastname, "gym king", "Sent value to last name");
    }
    public void sendInEmail(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.email, "Clicked on email");
        helper.sendData(SportsJamCreateAccountPageLocators.email, "murafliderf@gmail.com", "Sent value to email");
    }
    public void sendInPassword(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.password, "Clicked on password");
        helper.sendData(SportsJamCreateAccountPageLocators.password, "Awhrbr@#$hvbfhvbi2434", "Sent value to password");
    }
    public void sendInConfirmPassword(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.confirmPassword, "Clicked on ");
        helper.sendData(SportsJamCreateAccountPageLocators.confirmPassword, "Awhrbr@#$hvbfhvbi2434", "Sent value to confirmpassword");
    }
    public void clickOnCreate(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.create, "Clicked on create");
    }
    public void verifyThankYou(){
        try {
            String data = helper.getText(SportsJamCreateAccountPageLocators.thankYou, "Verified Thank you message");
            Assert.assertTrue(data.contains("THANK YOU"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickONLogout(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.logout,"Clicked on logout");
    }
    public void backNavigate(){
        helper.navigateBack("Navigated Back");
    }
    public void sendInLoginEmail(){
        helper.sendData(SportsJamCreateAccountPageLocators.loginEmail, "test134@gmail.com", "Sent email in Login page");
    }
    public void sendInLoginPassword(){
        helper.sendData(SportsJamCreateAccountPageLocators.loginPassword, "test140@ga", "Sent password in Login page");
    }
    public void clickOnSignIn(){
        helper.clickOnElement(SportsJamCreateAccountPageLocators.signIn, "Clicked on signIn");
    }
    public void verifyErrorMessage(){
        try {
            String data = helper.getText(SportsJamCreateAccountPageLocators.errorMessage, "Verified Error Message");
            Assert.assertTrue(data.contains( "THE ACCOUNT SIGN-IN WAS INCORRECT OR YOUR ACCOUNT IS DISABLED"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void runCreateAccountPage(){
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
