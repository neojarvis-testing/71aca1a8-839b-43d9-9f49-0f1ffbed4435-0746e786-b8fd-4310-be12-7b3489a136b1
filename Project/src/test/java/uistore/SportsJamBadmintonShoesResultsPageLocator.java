package uistore;

import org.openqa.selenium.By;

public class SportsJamBadmintonShoesResultsPageLocator {
    private SportsJamBadmintonShoesResultsPageLocator(){}

    public static final By productNumberOne = By.xpath("//a[contains(text(), 'Yonex Blaze 2I Badminton Shoes (Red/Black/Gold)') and @class='product-item-link']");
    public static final By size5 = By.xpath("//div[@id='option-label-size_uk-196-item-511']");
    public static final By size10 = By.xpath("//div[@id='option-label-size_uk-196-item-521']");
    public static final By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public static final By errorMessageWithoutSize = By.xpath("//div[@id='super_attribute[196]-error']");
}