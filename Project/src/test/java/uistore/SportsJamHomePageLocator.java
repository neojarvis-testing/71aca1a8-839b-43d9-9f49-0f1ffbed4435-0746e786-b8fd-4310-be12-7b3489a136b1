package uistore;

import org.openqa.selenium.By;

public class SportsJamHomePageLocator {
    public static By searchIcon = By.cssSelector("a>span.search-icon-wrapper");
    public static By searchBar = By.xpath("//input[@class='input-text js-input-focus']");
    public static By placeholderSearchBar = By.xpath("//input[@placeholder='Search']");
    public static By goButton = By.xpath("//span[text()='Go']");
    public static By racketSports = By.cssSelector("a[href='https://sportsjam.in/racket-sports']");
    public static By badmintonRackets = By.cssSelector("a[href='https://sportsjam.in/buy-badminton-rackets-onine']");
    public static By badmintonShoes = By.cssSelector("a[href='https://sportsjam.in/badminton-shoes-online-india']");
}