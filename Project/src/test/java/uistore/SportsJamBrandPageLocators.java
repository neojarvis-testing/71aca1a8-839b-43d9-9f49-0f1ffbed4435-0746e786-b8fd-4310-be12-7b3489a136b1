package uistore;

import org.openqa.selenium.By;

public class SportsJamBrandPageLocators {

    private SportsJamBrandPageLocators(){}

    public static final By brandsText = By.cssSelector(".base");
    public static final By searchBar = By.xpath("//input[@name='keyword']");
    public static final By searchIcon = By.xpath("//button[@title='Search']");
    public static final By pumaLink = By.xpath("(//a[@href='https://sportsjam.in/shopbrand/puma'])[2]");
}
