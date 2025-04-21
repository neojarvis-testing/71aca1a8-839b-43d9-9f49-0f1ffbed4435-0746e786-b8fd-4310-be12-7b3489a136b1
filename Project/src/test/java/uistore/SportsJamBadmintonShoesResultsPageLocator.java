package uistore;

import org.openqa.selenium.By;

public class SportsJamBadmintonShoesResultsPageLocator {
    public static By productNumberOne = By.xpath("//a[contains(text(), 'Yonex Blaze 2I Badminton Shoes (Red/Black/Gold)') and @class='product-item-link']");
    public static By size5 = By.xpath("//div[@id='option-label-size_uk-196-item-511']");
    public static By size10 = By.xpath("//div[@id='option-label-size_uk-196-item-521']");
    public static By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public static By errorMessageWithoutSize = By.xpath("//div[@id='super_attribute[196]-error']");
}