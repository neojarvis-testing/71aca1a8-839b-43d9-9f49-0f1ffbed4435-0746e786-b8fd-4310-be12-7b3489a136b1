package uistore;

import org.openqa.selenium.By;

public class SportsJamBadmintonRacketsResultsPageLocator {

    private SportsJamBadmintonRacketsResultsPageLocator(){}

    public static final By headingBadmintonRackets = By.cssSelector("span.base");
    public static final By productNumberOne = By.xpath("//a[contains(text(), 'Yonex Arcsaber 2 Feel Badminton Racket (Strung, Black/Green)') and @class='product-item-link']");
    public static final By headingProductNumberOne = By.cssSelector("span.base");
    public static final By addToCartButtonLabel = By.xpath("//span[text()='Add to Cart']/parent::button[@id='product-addtocart-button']");
    public static final By increaseQuantity = By.cssSelector("a[class='icon-plus qty-plus']");
    public static final By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public static final By confirmationMessageInCartPopUp = By.xpath("//span[contains(text(),'Product added t')]");
    public static final By confirmationMessageInPage = By.xpath("//div[contains(text(), 'You added Yonex Arcsaber 2 Feel Badminton Racket (Strung, Black/Green) to your')]");
    public static final By errorMessageEmptyZipcode = By.xpath("//div[@class='message error']");
    public static final By zipCode = By.xpath("//input[@id='zipcode']");
    public static final By checkZipCodeButton = By.xpath("//button[@class='action primary']");
}
