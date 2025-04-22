package uistore;

import org.openqa.selenium.By;

public class SportsJamBrandPageLocators {

    public static By brandsText = By.cssSelector(".base");
    public static By searchBar = By.xpath("//input[@name='keyword']");
    public static By searchIcon = By.xpath("//button[@title='Search']");
    public static By pumaLink = By.xpath("(//a[@href='https://sportsjam.in/shopbrand/puma'])[2]");

}
