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
    
    public void HoverOnFitness(){
        helper.hoverOverElement(SportsJamGymGlovesPageLocators.fitness,"Hovered on fitness");
    }
    public void clickOnGymGloves(){
        helper.clickOnElement(SportsJamGymGlovesPageLocators.gymGloves, "Clicked on Gym Gloves");
    }
    public void verifyGymGloves(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.titleGymGloves, "Verified Gym Gloves");
            Assert.assertEquals(data, "Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnEverlast(){
        helper.clickOnElement(SportsJamGymGlovesPageLocators.everlast, "Clicked on Everlast");
    }
    public void verifyEverlast(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.titleEverlast, "Verified Everlast");
            Assert.assertEquals(data, "Everlast");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnProduct(){
        helper.clickOnElement(SportsJamGymGlovesPageLocators.product, "Clicked on product");
    }
    public void clickOnAddToCart(){
        helper.clickOnElement(SportsJamGymGlovesPageLocators.ADDTOCART, "Clicked on add to cart");
    }
    public void verifyProductAddedToCart(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.titleProductAddedToCart, "Verified Product added to cart");
            Assert.assertTrue(data.contains("YOU ADDED EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE) TO"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void hoverOnCart(){
        helper.hoverOverElement(SportsJamGymGlovesPageLocators.cart, "Hovered on cart on top right");
    }
    public void verifyName(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.inCartItem, "Verified Product added to cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnViewCart(){
        helper.clickOnElement(SportsJamGymGlovesPageLocators.viewCart, "Clicked on view Cart");
    }

    public void verifyShoppingCart(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.nameInCart, "Verified name in cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnProceedToCheckout(){
        helper.clickOnElement(SportsJamGymGlovesPageLocators.proceedToCheckout, "Clicked on proceed to checkout");
    }
    public void verifyOrderSummary(){
        try {
            String data = helper.getText(SportsJamGymGlovesPageLocators.orderSummary, "Verified Order Summary");
            Assert.assertEquals(data, "ORDER SUMMARY");
            Screenshot.captureScreenShot("Order summary");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void runGymGlovesPage(){
        HoverOnFitness();
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
    }
    
}
