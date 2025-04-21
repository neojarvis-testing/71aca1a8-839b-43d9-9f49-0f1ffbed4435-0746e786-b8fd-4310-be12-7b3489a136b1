package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamBadmintonRacketsResultsPageLocator;
import uistore.SportsJamBadmintonShoesResultsPageLocator;
import uistore.SportsJamHomePageLocator;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SportsJamBadmintonPage {
    public  ExtentTest test;
    public static WebDriverHelper helper;

    public SportsJamBadmintonPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
        this.test=test;
    }

    public void hoverOnRacketSports(){
        helper.hoverOverElement(SportsJamHomePageLocator.racketSports, "Hovered on Racket Sports");
    }

    public void clickOnBadmintonRackets(){
        helper.clickOnElement(SportsJamHomePageLocator.badmintonRackets, "Clicked on Badminton Rackets");
    }

    public void verifyBadmintonRackets(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.headingBadmintonRackets, "Page verified");
        helper.checkAssert(text, "BADMINTON RACKETS", "Heading verified");
    }

    public void clickOnProductNumberOne(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.productNumberOne, "Clicked on product");
    }

    public void verifyProductPage(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.headingProductNumberOne, "Heading verified");
        helper.checkAssert(text, "YONEX ARCSABER 2 FEEL", "Heading verified");
    }

    public void verifyAddToCartButton(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.addToCartButtonLabel, "Button verified");
        helper.checkAssert(text, "CART", "Button verified");
    }

    public void clickOnIncreaseQuantityButton(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.increaseQuantity, "Clicked on increase quantity button");
    }

    public void clickOnAddToCartButton(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.addToCartButton, "Clicked on add to cart button");
    }

    public void verifyConfirmationMessageInPopUp(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.confirmationMessageInCartPopUp, "Message verified");
        System.out.println(text+" no text");
        helper.checkAssert(text, "Product added to cart", "Message verified");
    }

    public void verifyConfirmationMessageInPage(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.confirmationMessageInPage, "Message verified");
        helper.checkAssert(text, "YONEX", "Message verified");
    }

    // public void clickOnCheckButton(){
    //     helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.checkZipcodeButton, "Clicked on Check Button");
    // }

    public void verifyZIPCodeError(){
        String text = helper.getText(SportsJamBadmintonRacketsResultsPageLocator.errorMessageEmptyZipcode, "Error message verified");
        helper.checkAssert(text, "ZIPCODE", "Error message verified");
    }

    public void clickOnZipCodeInputBox(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.zipcode, "Clicked on ZIP Code input box");
    }

    public void sendInputInZIPCodeInputBox(){
        helper.sendData(SportsJamBadmintonRacketsResultsPageLocator.zipcode, "641001", "Input sent");
    }

    public void clickOnCheckButton(){
        helper.clickOnElement(SportsJamBadmintonRacketsResultsPageLocator.checkZipcodeButton, "Clicked on Check Button");
    }

    // public void hoverOnRacketSports(){
    //     helper.hoverOverElement(SportsJamHomePageLocator.racketSports, "Hovered on Racket Sports");
    // }

    public void clickOnBadmintonShoes(){
        helper.clickOnElement(SportsJamHomePageLocator.badmintonShoes, "Clicked on badminton shoes");
    }

    public void verifyBadmintonShoes(){
        String text = Base.driver.getCurrentUrl();
        helper.checkAssert(text.toLowerCase(), "shoes", "Badminton shoes in page is verified");
    }

    public void clickOnProductNumberOneInPage(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.productNumberOne, "Clicked on the product");
    }

    public void clickOnSize5(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.size5, "Clicked on size 5");
    }

    // public void clickOnAddToCartButtonInPage(){
    //     helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.addToCartButton, "Clicked on add to cart button");
    // }
    
    public void verifyErrorMessage(){
        Screenshot.captureScreenShot("WithoutSizeShoes");
        String text = helper.getText(SportsJamBadmintonShoesResultsPageLocator.errorMessageWithoutSize, "Error message is verified");
        helper.checkAssert(text.toLowerCase(), "required", "Error message is verified");
    }

    public void clickOnSize10(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.size10, "Clicked on size 10");
    }

    public void clickOnAddToCartButtonInPage(){
        helper.clickOnElement(SportsJamBadmintonShoesResultsPageLocator.addToCartButton, "Clicked on add to cart button");
    }
    
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
