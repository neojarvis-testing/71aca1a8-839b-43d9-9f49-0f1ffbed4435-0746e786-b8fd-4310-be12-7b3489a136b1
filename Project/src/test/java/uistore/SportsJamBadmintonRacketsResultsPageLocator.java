package uistore;

import org.openqa.selenium.By;

public class SportsJamBadmintonRacketsResultsPageLocator {
    public static By headingBadmintonRackets = By.cssSelector("span.base");
    public static By productNumberOne = By.xpath("//a[contains(text(), 'Yonex Arcsaber 2 Feel Badminton Racket (Strung, Black/Green)') and @class='product-item-link']");
    public static By headingProductNumberOne = By.cssSelector("span.base");
    public static By addToCartButtonLabel = By.xpath("//span[text()='Add to Cart']/parent::button[@id='product-addtocart-button']");
    public static By increaseQuantity = By.cssSelector("a[class='icon-plus qty-plus']");
    public static By addToCartButton = By.id("#product-addtocart-button");
    public static By confirmationMessageInCartPopUp = By.xpath("//span[text()='Product added to cart' and @class='text']");
    public static By confirmationMessageInPage = By.xpath("//div[contains(text(), 'You added Yonex Arcsaber 2 Feel Badminton Racket (Strung, Black/Green) to your')]");
    public static By errorMessageEmptyZipcode = By.cssSelector("div[class='message error']");
    public static By zipcode = By.id("#zipcode");
    public static By checkZipcodeButton = By.id("#button-zipcode-check");
}
