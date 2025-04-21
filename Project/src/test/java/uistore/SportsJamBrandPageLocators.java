package uistore;

import org.openqa.selenium.By;

public class SportsJamBrandPageLocators {

    public static By brandstext = By.cssSelector(".base");
    public static By searchbar = By.xpath("//input[@name='keyword']");
    public static By searchicon = By.xpath("//button[@title='Search']");
    public static By pumalink = By.xpath("(//a[@href='https://sportsjam.in/shopbrand/puma'])[2]");

}
