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
        helper.sendData(AccountPageLocators.email, "murali@gmail.com", "Sent value to email");
    }
    public void sendInPassword(){
        helper.clickOnElement(AccountPageLocators.password, "Clicked on password");
        helper.sendData(AccountPageLocators.password, "Awhrbr@#$hvbfhvbi2434", "Sent value to password");
    }
    public void sendInConfirmPassword(){
        helper.clickOnElement(AccountPageLocators.confirmPassword, "Clicked on ");
        helper.sendData(AccountPageLocators.confirmPassword, "Awhrbr@#$hvbfhvbi2434", "Sent value to confirmpassword");
    }
    public void clickOnCreateAccount(){
        helper.clickOnElement(AccountPageLocators.create, "Clicked on create");
    }
    public void verifyGymGloves(){
        try {
            String data = helper.getText(GymGlovesPageLocators.titleGymGloves, "Verified Gym Gloves");
            Assert.assertEquals(data, "Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
