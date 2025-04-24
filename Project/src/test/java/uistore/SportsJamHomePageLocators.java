package uistore;

import org.openqa.selenium.By;

public class SportsJamHomePageLocators {

    private SportsJamHomePageLocators(){}
    
    public static final By brand = By.cssSelector("a[href='https://sportsjam.in/shopbrand']");
    public static final By shoes = By.xpath("//a[@href='https://sportsjam.in/shoes']");
    public static final By shoesMens = By.xpath("//a[@href='https://sportsjam.in/shoes']");
    public static final By shoesWomens = By.xpath("//a[@href='https://sportsjam.in/shoes']");
    public static final By shoesJunior = By.xpath("//a[@href='https://sportsjam.in/shoes']");
    public static final By shoesMenBadmintion = By.xpath("(//a[@href='https://sportsjam.in/sports/badminton-equipment-store-online-india/badminton-shoes-online-india'])[1]");

}
