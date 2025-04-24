package uistore;

import org.openqa.selenium.By;

public class SportsJamHomePageLocator {

    private SportsJamHomePageLocator(){}

    public static final By searchIcon = By.cssSelector("a>span.search-icon-wrapper");
    public static final By searchBar = By.xpath("//input[@class='input-text js-input-focus']");
    public static final By placeholderSearchBar = By.xpath("//input[@placeholder='Search']");
    public static final By goButton = By.xpath("//span[text()='Go']");
    public static final By racketSports = By.xpath("//a[@href='https://sportsjam.in/racket-sports']");
    public static final By badmintonRackets = By.xpath("//span[text()='Badminton Rackets']");
    public static final By badmintonShoes = By.xpath("//span[text()='Badminton Shoes']");
}