package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.SportsJamGymGlovesPageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SportsJamGymGlovesPage {
    ExtentTest test;
    WebDriverHelper helper;
    public SportsJamGymGlovesPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
    }
    
    /*
     * a. MethodName: hoverOnFitness
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to hover on fitness in navigation bar.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void hoverOnFitness(){
        try {
            helper.hoverOverElement(SportsJamGymGlovesPageLocators.fitness,"Hovered on fitness");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnGymGloves
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to Click on Gym Gloves under Fitness section.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnGymGloves(){
        try {
            helper.clickOnElement(SportsJamGymGlovesPageLocators.gymGloves, "Clicked on Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyGymGloves
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify title Gym Gloves .
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyGymGloves(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.titleGymGloves, "Verified Gym Gloves");
            Assert.assertEquals(data, "Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnEverlast
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to Click on Everlast in filter section.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnEverlast(){
        try {
            helper.clickOnElement(SportsJamGymGlovesPageLocators.everlast, "Clicked on Everlast");
            helper.takeScreenshot("ClickedEverlast","Clicked on EverLast");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyEverlast
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify everlast in filter section.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyEverlast(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.titleEverlast, "Verified Everlast");
            Assert.assertEquals(data, "Everlast");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnProduct
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to select first product.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnProduct(){
        try {
            helper.clickOnElement(SportsJamGymGlovesPageLocators.product, "Clicked on product");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnAddToCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on Add to cart Button.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnAddToCart(){
        try {
            helper.clickOnElement(SportsJamGymGlovesPageLocators.AddToCart, "Clicked on add to cart");
            helper.clickOnElement(SportsJamGymGlovesPageLocators.closeProduct,"Dismissed Product");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyProductAddedToCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to veridy that the product is added to cart.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyProductAddedToCart(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.titleProductAddedToCart, "Verified Product added to cart");
            Assert.assertTrue(data.contains("YOU ADDED EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE) TO"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: hoverOnCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to Hover on cart icon.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void hoverOnCart(){
        try {
            helper.hoverOverElement(SportsJamGymGlovesPageLocators.cart, "Hovered on cart on top right");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyName
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify product name.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyName(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.inCartItem, "Verified Product added to cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnViewCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on View Cart.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnViewCart(){
        try {
            helper.clickOnElement(SportsJamGymGlovesPageLocators.viewCart, "Clicked on view Cart");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyShoppingCart
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify shopping cart contains product.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyShoppingCart(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.nameInCart, "Verified name in cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: clickOnProceedToCheckout
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to click on proceed to check out.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void clickOnProceedToCheckout(){
        try {
            helper.clickOnElement(SportsJamGymGlovesPageLocators.proceedToCheckout, "Clicked on proceed to checkout");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: verifyOrderSummary
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to verify order summary.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void verifyOrderSummary(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.orderSummary, "Verified Order Summary");
            Assert.assertEquals(data, "ORDER SUMMARY");
            Screenshot.captureScreenShot("Order summary");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * a. MethodName: runGymGlovesPage
     * b. AuthorName: Gagandeep Kanta
     * c. Description: This is used to call and run the above methods in order.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void runGymGlovesPage(){
        try {
            hoverOnFitness();
            clickOnGymGloves();
            verifyGymGloves();
            clickOnEverlast();
            verifyEverlast();
            clickOnProduct();
            clickOnAddToCart();
            verifyProductAddedToCart();
            hoverOnCart();
            verifyName();
            clickOnViewCart();
            verifyShoppingCart();
            clickOnProceedToCheckout();
            verifyOrderSummary();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
