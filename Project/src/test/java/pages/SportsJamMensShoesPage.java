package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamBadmintonShoesPage;
import uistore.SportsJamHomePageLocators;
import utils.ExcelReader;
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
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 0, 2),"Cricket Shoes Page Url is verified");
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
    webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 1, 2),"Home page url is verified");
    }

    /*
     * a. MethodName: verifyCategories
     * b. AuthorName: Sharath
     * c. Description: This verifes the categroies section under brand
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyCategories() {
        // webDriverHelper.verifyPageUrl(SportsJamHomePageLocators.shoes, "");
    }

    /*
     * a. MethodName: clickOnBadmintion
     * b. AuthorName: Sharath
     * c. Description: This clicks on the badmintion button
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void clickOnBadmintion() {
        webDriverHelper.clickOnElement(SportsJamHomePageLocators.shoesMenBadmintion, "Clicked On Badmintion");
    }

    /*
     * a. MethodName: verifyBadmintonShoesPage
     * b. AuthorName: Sharath
     * c. Description: This verifies badminton page url
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyBadmintonShoesPage() {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 2, 2),"Badminton Shoes Page Url is verified");
    }

    /*
     * a. MethodName: clickOnBasketball
     * b. AuthorName: Sharath
     * c. Description: This clicks on BasketBall button
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void clickOnBasketball() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.basketballShoes, "clicked on Basket Ball");
    }

    /*
     * a. MethodName: verifyBasketBallShoesPage
     * b. AuthorName: Sharath
     * c. Description: This verifies the basketball shoes
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyBasketBallShoesPage() {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 3, 2),"Basket Shoes Page Url is verified");
    }

    /*
     * a. MethodName: clickOnCricket
     * b. AuthorName: Sharath
     * c. Description: This clicks on cricket
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void clickOnCricket() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.cricketShoes,"Clicked on Cricket");
    }

    /*
     * a. MethodName: clickOnFootBall
     * b. AuthorName: Sharath
     * c. Description: This clicks on football button
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void clickOnFootBall() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.footballShoes, "click on football");
    }

    /*
     * a. MethodName: verifyFootBallShoesPage
     * b. AuthorName: Sharath
     * c. Description: This verifies the Football shoes page url
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyFootBallShoesPage(){
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 4, 2),"Basket Shoes Page Url is verified");
    }

    /*
     * a. MethodName: clickOnRunning
     * b. AuthorName: Sharath
     * c. Description: This clicks on Running button
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void clickOnRunning() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.runningShoes, "clicked on running");
    }

    /*
     * a. MethodName: verifyRunningShoesPage
     * b. AuthorName: Sharath
     * c. Description: This verifies the Running shoes page url
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifyRunningShoesPage() {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 5, 2), "Running shoes Page is verified");
    }

    /*
     * a. MethodName: hoverOnShoes
     * b. AuthorName: Sharath
     * c. Description: This hovers on shoes
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void hoverOnShoes() {
        webDriverHelper.hoverOverElement(SportsJamHomePageLocators.shoes,"hover on shoes");
    }

    /*
     * a. MethodName: clickOnSquash
     * b. AuthorName: Sharath
     * c. Description: This clicks on squash button
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void clickOnSquash() {
        webDriverHelper.clickOnElement(SportsJamBadmintonShoesPage.squashShoes, "Clicked on Squash");
    }

    /*
     * a. MethodName: verifySquashShoesPage
     * b. AuthorName: Sharath
     * c. Description: This verifies the squash shoes page url
     * d. Parameters: None
     * e. ReturnType: None
     */
    private void verifySquashShoesPage() {
        webDriverHelper.verifyPageUrl(ExcelReader.getCellData("PageURLS", 6, 2),"Squash Shoes Page verified");
    }
}
