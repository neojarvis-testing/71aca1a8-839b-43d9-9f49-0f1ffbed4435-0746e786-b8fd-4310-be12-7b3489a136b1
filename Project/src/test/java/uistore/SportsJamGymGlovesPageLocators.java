package uistore;

import org.openqa.selenium.By;

public class SportsJamGymGlovesPageLocators {
    public static By fitness = By.xpath("//span[contains(text(),'Fitness')]");
    public static By gymGloves = By.xpath("//span[text()='Gym Gloves']");
    public static By titleGymGloves = By.xpath("//li[@class='item']/span[text()='Gym Gloves']");
    public static By everlast = By.xpath("//span[text()='Everlast']");
    public static By titleEverlast = By.xpath("//li[@class='item']/span[text()='Everlast']");
    public static By titleProductAddedToCart = By.xpath("//div[contains(text(),'You added Everlast Mens Universal FIT Gloves (Size M&L, Blue) to your ')]");
    public static By product = By.xpath("//div[@id='product-item-info_4311']"); 
    public static By ADDTOCART = By.xpath("//div[@class='product-info-main']/descendant::span[text()='Add to Cart']");
    public static By cart = By.xpath("//a[@class='action showcart']");
    public static By patc = By.xpath("//span[text()='Product added to cart']");
    public static By inCartItem = By.xpath("//ol[@id='mini-cart']/descendant::a[text()='Everlast Mens Universal FIT Gloves (Size M&L, Blue)']");
    public static By viewCart = By.xpath("//span[text()='View Cart']");
    public static By nameInCart = By.xpath("//a[text()='Everlast Mens Universal FIT Gloves (Size M&L, Blue)']");
    public static By proceedToCheckout = By.xpath("//div[@class='cart-summary']/descendant::button[@title='Proceed to Checkout']");
    public static By orderSummary = By.xpath("//span[text()='Order Summary']");

    
}
