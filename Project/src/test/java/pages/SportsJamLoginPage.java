package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamLoginLocators;
import utils.Base;
import utils.WebDriverHelper;

public class SportsJamLoginPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SportsJamLoginPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver, test);
        this.test=test;
    }
    public void clickonlogin()
    {
        try {
            helper.jsScrollUsingPixel(0, 10000, "Scrolled to Login");
            helper.clickOnElement(SportsJamLoginLocators.login,"Clicked on login");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void verifylogin()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains("Customer Login"));
    }
    public void backfromlogin()
    {
        helper.navigateBack("Navigated back from login page");
    }
    public void clickondelivery()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to delivery");
        helper.clickOnElement(SportsJamLoginLocators.delivery,"Clicked on delivery&charges");
    }
    public void verifydelivery()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains("Delivery"));
    }
    public void backfromdelivery()
    {
        helper.navigateBack("Navigated back from delivery&charges page");
    }
    public void clickonpayment()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to payment");
        helper.clickOnElement(SportsJamLoginLocators.payment,"Clicked on PaymentOptions");
    }
    public void verifypayment()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains("Payment"));
    }
    public void backfrompayment()
    {
        helper.navigateBack("Navigated back from PaymentOptions page");
    }
    public void clickonFAQ()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to FAQs");
        helper.clickOnElement(SportsJamLoginLocators.FAQs,"Clicked on FAQ");
    }
    public void verifyFAQ()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains("sportsjam"));   
    }
    public void backfromFAQ()
    {
        helper.navigateBack("Navigated back from FAQ page");
    }
    public void clickonPolicy()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to Returns");
        helper.clickOnElement(SportsJamLoginLocators.policy,"Clicked on Returns Policy");
    }
    public void verifyPolicy()
    {
        String title=Base.driver.getTitle();
        Assert.assertTrue(title.contains("returns"));
    }
    public void backfromPolicy()
    {
        helper.navigateBack("Navigated back from Returns page");
    }
    public void testlogin()
    {
        clickonlogin();
        verifylogin();
        backfromlogin();
        clickondelivery();
        verifydelivery();
        backfromdelivery();
        clickonpayment();
        verifypayment();
        backfrompayment();
        clickonFAQ();
        verifyFAQ();
        backfromFAQ();
        clickonPolicy();
        verifyPolicy();
        backfromPolicy();
    }
}
