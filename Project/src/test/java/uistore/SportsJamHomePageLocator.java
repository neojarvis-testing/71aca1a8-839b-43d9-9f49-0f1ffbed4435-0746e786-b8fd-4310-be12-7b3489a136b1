package uistore;

import org.openqa.selenium.By;

public class SportsJamHomePageLocator {
    public static By searchIcon = By.cssSelector("a>span.search-icon-wrapper");
    public static By searchBar = By.id("#search");
    public static By placeholderSearchBar = By.xpath("//input[@placeholder='Search']");
    public static By goButton = By.xpath("//span[text()='Go']");
}