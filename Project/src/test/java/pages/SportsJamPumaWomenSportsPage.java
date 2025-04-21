package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.PumaProductPageLocators;
import uistore.SportsJamBrandPageLocators;
import uistore.SportsJamCustomerLoginLocators;
import uistore.SportsJamHomePageLocators;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class SportsJamPumaWomenSportsPage {

    WebDriverHelper webDriverHelper;

    public SportsJamPumaWomenSportsPage(WebDriver driver, ExtentTest test)
    {
        webDriverHelper = new WebDriverHelper(driver, test);
    }

    public void runWomenSportsCase()
    {
        verifyHomePageURL();
        
        clickOnBrand();

        verifyBrandsPageURL();

        clickOnSearchBar();

        sendDataToSearchBar();

        clickOnSearchIcon();

        verifyTextForPuma();

        clickOnPuma();

        verifyThePumaPage();

        clickOnAccesories();

        verifyAccessoiresTextInFilter();

        hoverOverPumaWomenSportQuartersAssorted();

        clickOnQuickView();

        switchToIframe();

        verifyIFrameURL();

        clickOnWishList();

        verifyLoginPromptMessage();

        clickAndSendDataToEmail();

        clickAndSendDataToPassword();

        clickOnSignIn();

        verifyTheErrorMessage();
    }

    private void verifyHomePageURL() 
    {
        // ExcelReader.getCellData("PageUrl",0,0);
        webDriverHelper.verifyPageUrl("https://sportsjam.in/","Home page url is verified");
    }
    
    private void clickOnBrand() 
    {
        webDriverHelper.clickOnElement(SportsJamHomePageLocators.brand, "Clicked on brand");
    }
    
    private void verifyBrandsPageURL() 
    {
        // ExcelReader.getCellData("PageUrl",1,0);
        webDriverHelper.verifyPageUrl("https://sportsjam.in/shopbrand","Brand page url is verified");
        
    }

    private void clickOnSearchBar() 
    {
        webDriverHelper.clickOnElement(SportsJamBrandPageLocators.searchbar, "Clicked on searchbar");
    }
    
    private void sendDataToSearchBar() 
    {
        // ExcelReader.getCellData("DataToBeSent",0,0);
        webDriverHelper.sendData(SportsJamBrandPageLocators.searchbar,"Puma", "Sent Puma to searchbar");
    }

    private void clickOnSearchIcon() 
    {
        webDriverHelper.clickOnElement(SportsJamBrandPageLocators.searchicon, "Clicked on search icon");
    }

    private void verifyTextForPuma() 
    {
        String text = webDriverHelper.getText(SportsJamBrandPageLocators.pumalink,"puma text is retrieved form element");
        Assert.assertTrue(text.contains("Puma"));
    }

    private void clickOnPuma() 
    {
        webDriverHelper.clickOnElement(SportsJamBrandPageLocators.pumalink, "Clicked on Puma result");
    }

    private void verifyThePumaPage() 
    {
        // ExcelReader.getCellData("PageUrl",2,0);
        webDriverHelper.verifyPageUrl("https://sportsjam.in/shopbrand/puma","Puma Product Result page url is verified");
    }

    private void clickOnAccesories() 
    {
        webDriverHelper.clickOnElement(PumaProductPageLocators.accessories, "Clicked on Accessries");
    }

    private void verifyAccessoiresTextInFilter() 
    {
        String text = webDriverHelper.getText(PumaProductPageLocators.accessoriesText, "Retrieved Accessories text from element");
        Assert.assertTrue(text.contains("Accessories"));
    }

    private void hoverOverPumaWomenSportQuartersAssorted() 
    {
        webDriverHelper.hoverOverElement(PumaProductPageLocators.firstProduct,"Hoverd on Women Sport Quarter Assorted Prodcut");
    }

    private void clickOnQuickView() 
    {
        webDriverHelper.clickOnElement(PumaProductPageLocators.quickview, "Clicked on QuickView");
    }

    private void switchToIframe() 
    {
        webDriverHelper.switchToIFrame(PumaProductPageLocators.iframe, "Switched to Iframe");
    }

    private void verifyIFrameURL() 
    {
        webDriverHelper.verifyPageUrl("https://sportsjam.in/ox_quickview/catalog_product/view/id/30663/", "Iframe Page Url Verified");
    }

    private void clickOnWishList() 
    {
        webDriverHelper.clickOnElement(PumaProductPageLocators.wishlist, "Clicked On WishList");
    }

    private void verifyLoginPromptMessage() 
    {
        String text = webDriverHelper.getText(SportsJamCustomerLoginLocators.promtMessage, "Retrieved Prompt message");
        Assert.assertTrue(text.contains("You must login or register to add items to your wishlist."));
    }

    private void clickAndSendDataToEmail() 
    {
        // ExcelReader.getCellData("CustomerLogin",0,0);
        webDriverHelper.sendData(SportsJamCustomerLoginLocators.email,"test134@gmail.com","Sent email to input field");
    }

    private void clickAndSendDataToPassword() 
    {
        // ExcelReader.getCellData("CustomerLogin",1,0);
        webDriverHelper.sendData(SportsJamCustomerLoginLocators.password, "test140@ga", "Sent data to password field");
    }

    private void clickOnSignIn() 
    {
        webDriverHelper.clickOnElement(SportsJamCustomerLoginLocators.signin,"Clicked on Signin");
    }

    private void verifyTheErrorMessage() 
    {
        String text = webDriverHelper.getText(SportsJamCustomerLoginLocators.promtMessage,"Retrieved data form prompt ext");

    }

}
