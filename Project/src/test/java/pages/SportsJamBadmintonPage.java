package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamBadmintonRacketsResultsPageLocator;
import uistore.SportsJamBadmintonShoesResultsPageLocator;
import uistore.SportsJamHomePageLocator;
import utils.Base;
import utils.ExcelReader;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SportsJamBadmintonPage {
    public  ExtentTest test;
    public static WebDriverHelper helper;

    public SportsJamBadmintonPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
        this.test=test;
    }

    /*
     * a. Method Name: hoverOnRacketSports
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to hover on Racket Sports.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void hoverOnRacketSports(){
        helper.hoverOverElement(SportsJamHomePageLocator.racketSports, "Hovered on Racket Sports");
    }

    /*
     * a. Method Name: clickOnBadmintonRackets
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on Badminton Rackets.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnBadmintonRackets(){
        helper.clickOnElement(SportsJamHomePageLocator.badmintonRackets, "Clicked on Badminton Rackets");
    }

    /*
     * a. Method Name: verifyBadmintonRackets
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the badminton rackets heading.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyBadmintonRackets(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.headingBadmintonRackets, "Page verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 7, 0), "Heading verified");
    }

    /*
     * a. Method Name: clickOnProductNumberOne
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on the product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnProductNumberOne(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.productNumberOne, "Clicked on product");
    }

    /*
     * a. Method Name: verifyProductPage
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the product heading in the page.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyProductPage(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.headingProductNumberOne, "Heading verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 8, 0), "Heading verified");
    }

    /*
     * a. Method Name: verifyAddToCartButton
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the add to cart button.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyAddToCartButton(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.addToCartButtonLabel, "Button verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 9, 0), "Button verified");
    }

    /*
     * a. Method Name: clickOnIncreaseQuantityButton
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on increase quantity button.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnIncreaseQuantityButton(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.increaseQuantity, "Clicked on increase quantity button");
    }

    /*
     * a. Method Name: clickOnAddToCartButton
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on add to cart to button.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnAddToCartButton(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.addToCartButton, "Clicked on add to cart button");
    }

    /*
     * a. Method Name: verifyConfirmationMessageInPopUp
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the confirmation message in pop up.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyConfirmationMessageInPopUp(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.confirmationMessageInCartPopUp, "Message verified");
        System.out.println(text+" no text");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 10, 0), "Message verified");
    }

    /*
     * a. Method Name: verifyConfirmationMessageInPage
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the confirmation message in the page.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyConfirmationMessageInPage(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.confirmationMessageInPage, "Message verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 11, 0), "Message verified");
    }

    /*
     * a. Method Name: verifyZIPCodeError
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the ZIP Code Error message.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyZIPCodeError(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.errorMessageEmptyZipcode, "Error message verified");
        helper.checkAssert(text, ExcelReader.getCellData("AssertData", 12, 0), "Error message verified");
    }

    /*
     * a. Method Name: clickOnZipCodeInputBox
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on the ZIP Code input box.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnZipCodeInputBox(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.zipCode, "Clicked on ZIP Code input box");
    }

    /*
     * a. Method Name: sendInputInZIPCodeInputBox
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to send the input in ZIP Code input box.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void sendInputInZIPCodeInputBox(){
        helper.sendData(SportsJamBadmintonRacketsResultsPageLocator.zipCode, ExcelReader.getCellData("InputData", 0, 0), "Input sent");
    }

    /*
     * a. Method Name: clickOnCheckButton
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on the checkout button.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnCheckButton(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.checkZipCodeButton, "Clicked on Check Button");
    }

    /*
     * a. Method Name: clickOnBadmintonShoes
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on the badminton shoes.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnBadmintonShoes(){
        helper.clickOnElement(SportsJamHomePageLocator.badmintonShoes, "Clicked on badminton shoes");
    }

    /*
     * a. Method Name: verifyBadmintonShoes
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify badminton shoes label in the page URL.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyBadmintonShoes(){
        String text = Base.driver.getCurrentUrl();
        helper.checkAssert(text.toLowerCase(), ExcelReader.getCellData("AssertData", 13, 0), "Badminton shoes in page is verified");
    }

    /*
     * a. Method Name: clickOnProductNumberOneInPage
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on the product.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnProductNumberOneInPage(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.productNumberOne, "Clicked on the product");
    }

    /*
     * a. Method Name: clickOnSize5
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on size 5 option.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnSize5(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.size5, "Clicked on size 5");
    }
    
    /*
     * a. Method Name: verifyErrorMessage
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to verify the error message for the size option.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyErrorMessage(){
        Screenshot.captureScreenShot("WithoutSizeShoes");
        String text = helper.getText(SportsJamBadmintonShoesResultsPageLocator.errorMessageWithoutSize, "Error message is verified");
        helper.checkAssert(text.toLowerCase(), ExcelReader.getCellData("AssertData", 14, 0), "Error message is verified");
    }

    /*
     * a. Method Name: clickOnSize10
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on size 10 option.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnSize10(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.size10, "Clicked on size 10");
    }

    /*
     * a. Method Name: clickOnAddToCartButtonInPage
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to click on add to cart button in the page.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnAddToCartButtonInPage(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.addToCartButton, "Clicked on add to cart button");
    }
    
    /*
     * a. Method Name: addProductsToCart
     * b. Author Name: Tanishk Maheshwari
     * c. Description: This will be used to integrate all the methods in a single method which will be called in the runner.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void addProductsToCart(){
        hoverOnRacketSports();
        clickOnBadmintonRackets();
        verifyBadmintonRackets();
        clickOnProductNumberOne();
        verifyProductPage();
        verifyAddToCartButton();
        clickOnIncreaseQuantityButton();
        clickOnAddToCartButton();
        verifyConfirmationMessageInPopUp();
        // verifyConfirmationMessageInPage();
        clickOnCheckButton();
        verifyZIPCodeError();
        clickOnZipCodeInputBox();
        sendInputInZIPCodeInputBox();
        clickOnCheckButton();
        hoverOnRacketSports();
        clickOnBadmintonShoes();
        verifyBadmintonShoes();
        clickOnProductNumberOneInPage();
        clickOnSize5();
        clickOnAddToCartButtonInPage();
        verifyErrorMessage();
        clickOnSize10();
        clickOnAddToCartButtonInPage();
    }
}
