package uistore;

import org.openqa.selenium.By;

public class PumaProductPageLocators {

    public static By pumaText = By.cssSelector(".base");
    public static By accessories = By.xpath("//a[@href='https://sportsjam.in/buy-accessories?manufacturer=254']");
    public static By accessoriesText = By.cssSelector(".base");
    public static By firstProduct = By.xpath("(//a[@href='https://sportsjam.in/puma-sport-socks-online-india-puma-socks-p-1830241'])[2]");
    public static By quickView = By.xpath("(//a[@class='button quick-view ox-quickview-button'])[1]");
    public static By iframe = By.cssSelector("iframe");
    public static By womenSportText = By.cssSelector(".base");
    public static By wishList = By.xpath("//span[text()='Wish List']");
    
}
