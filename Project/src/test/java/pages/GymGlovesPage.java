package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.GymGlovesPageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class GymGlovesPage {
    ExtentTest test;
    WebDriverHelper helper;
    public GymGlovesPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver, test);
    }
    
    public void HoverOnFitness(){
        helper.hoverOverElement(GymGlovesPageLocators.fitness,"Hovered on fitness");
    }
    public void clickOnGymGloves(){
        helper.clickOnElement(GymGlovesPageLocators.gymGloves, "Clicked on Gym Gloves");
    }
    public void verifyGymGloves(){
        try {
            String data = helper.getText(GymGlovesPageLocators.titleGymGloves, "Verified Gym Gloves");
            Assert.assertEquals(data, "Gym Gloves");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnEverlast(){
        helper.clickOnElement(GymGlovesPageLocators.everlast, "Clicked on Everlast");
    }
    public void verifyEverlast(){
        try {
            String data = helper.getText(GymGlovesPageLocators.titleEverlast, "Verified Everlast");
            Assert.assertEquals(data, "Everlast");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnProduct(){
        helper.clickOnElement(GymGlovesPageLocators.product, "Clicked on product");
    }
    public void clickOnAddToCart(){
        helper.clickOnElement(GymGlovesPageLocators.ADDTOCART, "Clicked on add to cart");
    }
    public void verifyProductAddedToCart(){
        try {
            String data = helper.getText(GymGlovesPageLocators.titleProductAddedToCart, "Verified Product added to cart");
            Assert.assertTrue(data.contains("YOU ADDED EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE) TO"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void hoverOnCart(){
        helper.hoverOverElement(GymGlovesPageLocators.cart, "Hovered on cart on top right");
    }
    public void verifyName(){
        try {
            String data = helper.getText(GymGlovesPageLocators.inCartItem, "Verified Product added to cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnViewCart(){
        helper.clickOnElement(GymGlovesPageLocators.viewCart, "Clicked on view Cart");
    }

    public void verifyShoppingCart(){
        try {
            String data = helper.getText(GymGlovesPageLocators.nameInCart, "Verified name in cart");
            Assert.assertEquals(data, "EVERLAST MENS UNIVERSAL FIT GLOVES (SIZE M&L, BLUE)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnProceedToCheckout(){
        helper.clickOnElement(GymGlovesPageLocators.proceedToCheckout, "Clicked on proceed to checkout");
    }
    public void verifyOrderSummary(){
        try {
            String data = helper.getText(GymGlovesPageLocators.orderSummary, "Verified Order Summary");
            Assert.assertEquals(data, "ORDER SUMMARY");
            Screenshot.captureScreenShot("Order summary");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void testCase1(){

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
