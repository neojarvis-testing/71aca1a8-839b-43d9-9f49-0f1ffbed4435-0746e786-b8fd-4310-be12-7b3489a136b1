package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamFooterLocators;
import utils.Base;
import utils.WebDriverHelper;

public class SportsJamFooterPage {
    public static WebDriverHelper helper;
    public ExtentTest test;
    public SportsJamFooterPage(ExtentTest test)
    {
        helper=new WebDriverHelper(Base.driver, test);
        this.test=test;
    }
    /*
     * a. Method Name: clickOnFacebook
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on FacebookIcon
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnFacebook()
    {
        try {
            helper.jsScrollUsingPixel(0, 5000, "Scrolled to facebook");
            Thread.sleep(3000);
            helper.clickOnElement(SportsJamFooterLocators.facebookIcon, "Clicked on facebook");
            helper.switchToNewWindow();
            helper.jsScrollUsingPixel(0, 5000, "Scrolled to facebook");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: backFromFaceBook
     * b. Author Name: Srujana Makam
     * c. Description: A method to comeback to parent window
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backFromFaceBook()
    {
        helper.switchBackTowindow(0);
    }
    /*
     * a. Method Name: clickOnYouTube
     * b. Author Name: Srujana Makam
     * c. Description: A method to click on Youtube Icon 
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnYouTube()
    {
        helper.jsScrollUsingPixel(0, 10000, "Scrolled to youtube");
        helper.clickOnElement(SportsJamFooterLocators.youtubeIcon, "Clicked on youtube");
        helper.switchToNewWindow();
    }
    /*
     * a. Method Name: backfromYouTube
     * b. Author Name: Srujana Makam
     * c. Description: A method to comeback to parent window
     * d. Parameter: None
     * e. Return Type: void
     */
    public void backfromYouTube()
    {
        helper.switchBackTowindow(0);
    }
    public void switchtest()
    {
        clickOnFacebook();
        backFromFaceBook();
        clickOnYouTube();
        backfromYouTube();
    }
}
