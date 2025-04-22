package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamLoginLocators;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class SportsJamLoginPage {
    public static WebDriverHelper helper;
    public ExtentTest test;
    public SportsJamLoginPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver, test);
        this.test=test;
    }
    /*
     * a. Method Name: clickOnLogin
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on login/register link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnLogin()
    {
        try {
            helper.jsScrollUsingPixel(0, 5000, "Scrolled to Login");
            Thread.sleep(3000);
            helper.jsScrollUsingPixel(0, 5000, "Scrolled to Login");
            helper.clickOnElement(SportsJamLoginLocators.login,"Clicked on login");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: verifyLogin
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify login page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyLogin()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains(ExcelReader.getCellData("LoginSheet", 0, 0)));
    }
    /*
     * a. Method Name: backFromLogin
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from login/register link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backFromLogin()
    {
        helper.navigateBack("Navigated back from login page");
    }
    /*
     * a. Method Name: clickOnDelivery
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on delivery link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnDelivery()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to delivery");
        helper.clickOnElement(SportsJamLoginLocators.delivery,"Clicked on delivery&charges");
    }
    /*
     * a. Method Name: verifyDelivery
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify delivery page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyDelivery()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains(ExcelReader.getCellData("LoginSheet", 1, 0)));
    }
    /*
     * a. Method Name: backFromDelivery
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from delivery page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backFromDelivery()
    {
        helper.navigateBack("Navigated back from delivery&charges page");
    }
    /*
     * a. Method Name: clickOnPayment
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on payment link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnPayment()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to payment");
        helper.clickOnElement(SportsJamLoginLocators.payment,"Clicked on PaymentOptions");
    }
    /*
     * a. Method Name: verifyPayment
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify payment page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyPayment()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains(ExcelReader.getCellData("LoginSheet", 2, 0)));
    }
    /*
     * a. Method Name: backFromPayment
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from payment page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backFromPayment()
    {
        helper.navigateBack("Navigated back from PaymentOptions page");
    }
    /*
     * a. Method Name: clickOnFAQ
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on FAQs link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnFAQ()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to FAQs");
        helper.clickOnElement(SportsJamLoginLocators.FAQs,"Clicked on FAQ");
    }
    /*
     * a. Method Name: verifyFAQ
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify FAQs page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyFAQ()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains(ExcelReader.getCellData("LoginSheet", 3, 0)));  
    }
    /*
     * a. Method Name: backFromFAQ
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on login/register link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backFromFAQ()
    {
        helper.navigateBack("Navigated back from FAQ page");
    }
    /*
     * a. Method Name: clickOnPolicy
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on Policy link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnPolicy()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to Returns");
        helper.clickOnElement(SportsJamLoginLocators.policy,"Clicked on Returns Policy");
    }
    /*
     * a. Method Name: verifyPolicy
     * b. Author Name: Srujana Makam
     * c. Description: A method to verify Policy page
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyPolicy()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains(ExcelReader.getCellData("LoginSheet", 4, 0)));
    }
    /*
     * a. Method Name: backFromPolicy
     * b. Author Name: Srujana Makam
     * c. Description: A method to navigate back from Policy link
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backFromPolicy()
    {
        helper.navigateBack("Navigated back from Returns page");
    }
    public void testlogin()
    {
        clickOnLogin();
        verifyLogin();
        backFromLogin();
        clickOnDelivery();
        verifyDelivery();
        backFromDelivery();
        clickOnPayment();
        verifyPayment();
        backFromPayment();
        clickOnFAQ();
        verifyFAQ();
        backFromFAQ();
        clickOnPolicy();
        verifyPolicy();
        backFromPolicy();
    }
}
