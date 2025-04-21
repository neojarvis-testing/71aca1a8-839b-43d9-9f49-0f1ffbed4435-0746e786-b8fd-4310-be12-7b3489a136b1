package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamPumaWomenSportsPageLocators;
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
        webDriverHelper.verifyPageUrl("page url from excel","Home page url is verified");
    }
    
    private void clickOnBrand() 
    {
        webDriverHelper.clickOnElement(SportsJamPumaWomenSportsPageLocators.brand, "click on brand");
    }
    
    private void verifyBrandsPageURL() 
    {
        webDriverHelper.verifyPageUrl("page url from excel","Brand page url is verified");
        
    }

    private void clickOnSearchBar() 
    {
        webDriverHelper.clickOnElement(SportsJamPumaWomenSportsPageLocators.searchBar, "click on searchbar");
    }
    
    private void sendDataToSearchBar() 
    {
        webDriverHelper.sendData(SportsJamPumaWomenSportsPageLocators.searchBar,"Puma", "click on searchbar");
    }

    private void clickOnSearchIcon() 
    {
        webDriverHelper.clickOnElement(SportsJamPumaWomenSportsPageLocators.searchIcon, "click on search icon");
    }

    private void verifyTextForPuma() 
    {
        String text = webDriverHelper.getText(SportsJamPumaWomenSportsPageLocators.pumaText,"puma text is retrieved form element");
        Assert.assertTrue(text.contains("Puma"));
    }

    private void clickOnPuma() 
    {
        webDriverHelper.clickOnElement(SportsJamPumaWomenSportsPageLocators.pumaImage, null);
    }

    private void verifyThePumaPage() 
    {

    }

    private void clickOnAccesories() 
    {
        webDriverHelper.clickOnElement(, null);
    }

    private void verifyAccessoiresTextInFilter() 
    {

    }

    private void hoverOverPumaWomenSportQuartersAssorted() 
    {

    }

    private void clickOnQuickView() 
    {

    }

    private void switchToIframe() 
    {

    }

    private void verifyIFrameURL() 
    {

    }

    private void clickOnWishList() 
    {

    }

    private void verifyLoginPromptMessage() 
    {

    }

    private void clickAndSendDataToEmail() 
    {

    }

    private void clickAndSendDataToPassword() 
    {

    }

    private void clickOnSignIn() 
    {

    }

    private void verifyTheErrorMessage() 
    {

    }

}
