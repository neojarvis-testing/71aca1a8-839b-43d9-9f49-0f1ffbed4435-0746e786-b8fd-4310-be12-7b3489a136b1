package uistore;

import org.openqa.selenium.By;

public class SportsJamAdidasResultsPageLocator {

    private SportsJamAdidasResultsPageLocator(){}

    public static final By adidasHeading = By.cssSelector("span.base");
    public static final By filterCategoryRacketSports = By.xpath("//span[text()='Racket Sports' and @class='label']");
    public static final By filterCategoryRacketSportsLabel = By.xpath("//span[text()='Racket Sports' and @class='filter-value']");
    public static final By filterCategoryShoes = By.xpath("//span[text()='Shoes' and @class='label']");
    public static final By filterCategoryShoesLabel = By.xpath("//span[text()='Shoes' and @class='filter-value']");
    public static final By removeFilterCategoryRacketSports = By.cssSelector("a[title='Remove Category Racket Sports']");
    /*1.12 skipped */
    public static final By filterCategoryClothing = By.xpath("//span[text()='Clothing' and @class='label']");
    public static final By filterCategoryClothingLabel = By.xpath("//span[text()='Clothing' and @class='filter-value']");
    public static final By filterCategoryAccessories = By.xpath("//span[text()='Accessories' and @class='label']");   
    public static final By filterCategoryAccessoriesLabel = By.xpath("//span[text()='Accessories' and @class='filter-value']");
    public static final By filterCategoryRunning = By.xpath("//span[text()='Running' and @class='label']");
    public static final By filterCategoryRunningLabel = By.xpath("//span[text()='Running' and @class='filter-value']");
    public static final By clearAllButton = By.xpath("//a[@class='action clear button filter-clear']");
    /*1.20 skipped */
}