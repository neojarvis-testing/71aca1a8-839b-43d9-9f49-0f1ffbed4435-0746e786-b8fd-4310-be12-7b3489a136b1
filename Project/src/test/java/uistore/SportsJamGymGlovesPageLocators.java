package uistore;

import org.openqa.selenium.By;

public class SportsJamGymGlovesPageLocators {
    private SportsJamGymGlovesPageLocators(){}

    public static final By closeProduct = By.cssSelector("button[id='btn-minicart-close']");
    public static final By fitness = By.xpath("//span[contains(text(),'Fitness')]");
    public static final By gymGloves = By.xpath("//span[text()='Gym Gloves']");
    public static final By titleGymGloves = By.xpath("//li[@class='item']/span[text()='Gym Gloves']");
    public static final By everlast = By.xpath("//span[text()='Everlast']");
    public static final By titleEverlast = By.xpath("//li[@class='item']/span[text()='Everlast']");
    public static final By titleProductAddedToCart = By.xpath("//div[contains(text(),'You added Everlast Mens Universal FIT Gloves (Size M&L, Blue) to your ')]");
    public static final By product = By.xpath("//div[@id='product-item-info_4311']"); 
    public static final By AddToCart = By.xpath("//div[@class='product-info-main']/descendant::span[text()='Add to Cart']");
    public static final By cart = By.xpath("//a[@class='action showcart']");
    public static final By productAddedToCart = By.xpath("//span[text()='Product added to cart']");
    public static final By inCartItem = By.xpath("//ol[@id='mini-cart']/descendant::a[text()='Everlast Mens Universal FIT Gloves (Size M&L, Blue)']");
    public static final By viewCart = By.xpath("//span[text()='View Cart']");
    public static final By nameInCart = By.xpath("//a[text()='Everlast Mens Universal FIT Gloves (Size M&L, Blue)']");
    public static final By proceedToCheckout = By.xpath("//div[@class='cart-summary']/descendant::button[@title='Proceed to Checkout']");
    public static final By orderSummary = By.xpath("//span[text()='Order Summary']");

    
}
