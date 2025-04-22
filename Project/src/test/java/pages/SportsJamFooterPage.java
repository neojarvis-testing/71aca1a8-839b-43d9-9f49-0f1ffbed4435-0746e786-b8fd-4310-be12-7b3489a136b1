package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.FooterLocators;
import utils.Base;
import utils.WebDriverHelper;

public class SportsJamFooterPage {
    public static WebDriverHelper helper;
    public static ExtentTest test;
    public SportsJamFooterPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver, test);
        this.test=test;
    }
    public void clickonfacebook()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to facebook");
        helper.clickOnElement(FooterLocators.facebook, "Clicked on facebook");
        helper.switchToNewWindow();
    }
    public void backfromfb()
    {
        helper.switchBackTowindow(0);
    }
    public void clickonutube()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to youtube");
        helper.clickOnElement(FooterLocators.youtube, "Clicked on youtube");
        helper.switchToNewWindow();
    }
    public void backfromut()
    {
        helper.switchBackTowindow(0);
    }
    public void switchtest()
    {
        clickonfacebook();
        backfromfb();
        clickonutube();
        backfromut();
    }
}
