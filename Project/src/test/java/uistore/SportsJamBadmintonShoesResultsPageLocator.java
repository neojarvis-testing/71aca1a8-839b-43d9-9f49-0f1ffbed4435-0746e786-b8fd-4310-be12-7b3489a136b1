package uistore;

import org.openqa.selenium.By;

public class SportsJamBadmintonShoesResultsPageLocator {
    public static By productNumberOne = By.xpath("//a[contains(text(), 'Yonex Blaze 2I Badminton Shoes (Red/Black/Gold)') and @class='product-item-link']");
    public static By size10 = By.id("#option-label-size_uk-196-item-521");
    public static By addToCartButton = By.id("#product-addtocart-button");
    public static By errorMessageWithoutSize = By.cssSelector("div.mage-error");
}