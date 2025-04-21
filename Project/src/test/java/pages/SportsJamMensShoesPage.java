package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamBadmintonShoesPage;
import uistore.SportsJamHomePageLocators;
import utils.WebDriverHelper;

public class SportsJamMensShoesPage {

    WebDriverHelper webDriverHelper;

    public SportsJamMensShoesPage(WebDriver driver, ExtentTest test)
    {
        webDriverHelper = new WebDriverHelper(driver, test);
    }

    /*
     * a. MethodName: runMensShoesCase
     * b. AuthorName: Sharath
     * c. Description: This Code Cluster runs the operations in a sequence
     * d. Parameters: None
     * e. ReturnType: None
     */
    public void runMensShoesCase()
    {
        verifyHomePageURL();
                
        hoverOnShoes();

        verifyCategories();

        clickOnBadmintion();

        verifyBadmintonShoesPage();

        hoverOnShoes();

        clickOnBasketball();

        verifyBasketBallShoesPage();

        hoverOnShoes();

        clickOnCricket();

        verifyCricketShoesPage();
            
        hoverOnShoes();

        clickOnFootBall();

        verifyFootBallShoesPage();

        hoverOnShoes();

        clickOnRunning();

        verifyRunningShoesPage();

        hoverOnShoes();

        clickOnSquash();

        verifySquashShoesPage();
    }
        
    /*
     * a. MethodName: verifyCricketShoesPage
     * b. AuthorName: Sharath
     * c. Description: This verifes the cricket shoes link
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyCricketShoesPage() {
        webDriverHelper.verifyPageUrl("https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-shoes-shop-online-india","Cricket Shoes Page Url is verified");
    }

    /*
     * a. MethodName: verifyHomePageURL
     * b. AuthorName: Sharath
     * c. Description: This verifes the Home Page link
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyHomePageURL() {
    // ExcelReader.getCellData("PageUrl",0,0);
    webDriverHelper.verifyPageUrl("https://sportsjam.in/","Home page url is verified");
    }

    /*
     * a. MethodName: verifyCategories
     * b. AuthorName: Sharath
     * c. Description: This verifes the Home Page link
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyCategories() {
        // webDriverHelper.verifyPageUrl(SportsJamHomePageLocators.shoes, "");
    }

    private void clickOnBadmintion() {
        webDriverHelper.clickOnElement(SportsJamHomePageLocators.badmintion, "Clicked On Badmintion");
    }

    private void verifyBadmintonShoesPage() {
        webDriverHelper.verifyPageUrl("https://sportsjam.in/badminton-shoes-online-india","Badminton Shoes Page Url is verified");
    }

    private void clickOnBasketball() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.basketball, "clicked on Basket Ball");
    }

    private void verifyBasketBallShoesPage() {
        webDriverHelper.verifyPageUrl("https://sportsjam.in/sports/basketball-gear-online-india/basketball-shoes-online-india","Basket Shoes Page Url is verified");
    }

    private void clickOnCricket() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.cricket,"Clicked on Cricket");
    }

    private void clickOnFootBall() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.football, "Clicked on football");
    }

    private void verifyFootBallShoesPage(){
        webDriverHelper.verifyPageUrl("https://sportsjam.in/sports/buy-sports-football/football-shoes-online-india","Basket Shoes Page Url is verified");
    }

    private void clickOnRunning() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.running, "clicked on running");
    }

    private void verifyRunningShoesPage() {
        webDriverHelper.verifyPageUrl("https://sportsjam.in/buy-running/buy-running-shoes-online-india", "Running shoes Page is verified");
    }

    private void hoverOnShoes() {
        webDriverHelper.hoverOverElement(SportsJamHomePageLocators.shoes,"hover on shoes");
    }

    private void clickOnSquash() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.squash, "Clicked on Squash");
    }

    private void verifySquashShoesPage() {
        webDriverHelper.verifyPageUrl("https://sportsjam.in/indoor-court-squash-shoes-online-india","Squash Shoes Page verified");
    }
}
