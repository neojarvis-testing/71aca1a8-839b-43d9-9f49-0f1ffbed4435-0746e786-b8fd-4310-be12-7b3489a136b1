package uistore;

import org.openqa.selenium.By;

public class PumaProductPageLocators {

    private PumaProductPageLocators(){}
    public static final By pumaText = By.cssSelector(".base");
    public static final By accessories = By.xpath("//a[@href='https://sportsjam.in/buy-accessories?manufacturer=254']");
    public static final By accessoriesText = By.cssSelector(".base");
    public static final By firstProduct = By.xpath("(//a[@href='https://sportsjam.in/puma-sport-socks-online-india-puma-socks-p-1830241'])[2]");
    public static final By quickView = By.xpath("(//a[@class='button quick-view ox-quickview-button'])[1]");
    public static final By iframe = By.cssSelector("iframe");
    public static final By womenSportText = By.cssSelector(".base");
    public static final By wishList = By.xpath("//span[text()='Wish List']");
    
}
