package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamCreateAccountPageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class SportsJamCreateAccountPage {
    ExtentTest test;
    WebDriverHelper helper;
    public SportsJamCreateAccountPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
    }

    /*
     * a. MethodName: hoverOnLogin
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to hover on Login Icon.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void hoverOnLogin(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.hoverOverElement(SportsJamCreateAccountPageLocators.loginIcon, "Hovered on Login");
    }

    /*
     * a. MethodName: clickOnLogin
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on login.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnLogin(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.loginButton, "Clicked on LOG IN");
    }

    /*
     * a. MethodName: clickOnCreateAccount
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on create account.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCreateAccount(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.createAccount, "Clicked on create Account");
    }

    /*
     * a. MethodName: sendInFirstName
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in first name.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInFirstName(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.firstName, "Clicked on Firstname");
        helper.sendData(SportsJamCreateAccountPageLocators.firstName, ExcelReader.getCellData("CreateAccountPage", 0, 0), "Sent value to firstname");
    }

    /*
     * a. MethodName: sendInLastName
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in last name.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInLastName(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.lastName, "Clicked on ");
        helper.sendData(SportsJamCreateAccountPageLocators.lastName, ExcelReader.getCellData("CreateAccountPage", 1, 0), "Sent value to last name");
    }

    /*
     * a. MethodName: sendInEmail
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in email.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInEmail(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.email, "Clicked on email");
        helper.sendData(SportsJamCreateAccountPageLocators.email,  ExcelReader.getCellData("CreateAccountPage", 0, 1), "Sent value to email");
    }

    /*
     * a. MethodName: sendInPassword
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in password field.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInPassword(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.password, "Clicked on password");
        helper.sendData(SportsJamCreateAccountPageLocators.password,  ExcelReader.getCellData("CreateAccountPage", 1, 1), "Sent value to password");
    }

    /*
     * a. MethodName: sendInConfirmPassword
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in confirm password.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInConfirmPassword(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.confirmPassword, "Clicked on ");
        helper.sendData(SportsJamCreateAccountPageLocators.confirmPassword,  ExcelReader.getCellData("CreateAccountPage", 2, 1), "Sent value to confirmpassword");
    }

    /*
     * a. MethodName: clickOnCreate
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on create account.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnCreate(){
        try {
            helper.clickOnElement(SportsJamCreateAccountPageLocators.create, "Clicked on create");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. MethodName: verifyThankYou
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify thank you message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyThankYou(){
        try {
            String data = helper.getText(SportsJamCreateAccountPageLocators.thankYou, "Verified Thank you message");
            Assert.assertTrue(data.contains("THANK YOU"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnLogout
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on logout.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnLogout(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.logout,"Clicked on logout");
    }

    /*
     * a. MethodName: backNavigate
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to navigate back.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void backNavigate(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.navigateBack("Navigated Back");
    }

    /*
     * a. MethodName: sendInLoginEmail
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in email in login page.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInLoginEmail(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.sendData(SportsJamCreateAccountPageLocators.loginEmail, "test134@gmail.com", "Sent email in Login page");
    }

    /*
     * a. MethodName: sendInLoginPassword
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to send data in password in login page.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void sendInLoginPassword(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.sendData(SportsJamCreateAccountPageLocators.loginPassword, "test140@ga", "Sent password in Login page");
    }

    /*
     * a. MethodName: clickOnSignIn
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on sign in.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnSignIn(){
        try {
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helper.clickOnElement(SportsJamCreateAccountPageLocators.signIn, "Clicked on signIn");
    }

    /*
     * a. MethodName: verifyErrorMessage
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify error message.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyErrorMessage(){
        try {
            String data = helper.getText(SportsJamCreateAccountPageLocators.errorMessage, "Verified Error Message");
            Assert.assertTrue(data.contains( "THE ACCOUNT SIGN-IN WAS INCORRECT OR YOUR ACCOUNT IS DISABLED"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: runCreateAccountPage
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to call and run the above methods in order.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void runCreateAccountPage(){
        try {
            hoverOnLogin();
            clickOnLogin();
            clickOnCreateAccount();
            sendInFirstName();
            sendInLastName();
            sendInEmail();
            sendInPassword();
            sendInConfirmPassword();
            clickOnCreate();
            verifyThankYou();
            clickOnLogout();
            backNavigate();
            sendInLoginEmail();
            sendInLoginPassword();
            clickOnSignIn();
            verifyErrorMessage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
