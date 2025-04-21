package uistore;

import org.openqa.selenium.By;

public class SportsJamAdidasResultsPageLocator {
    public static By adidasHeading = By.cssSelector("span.base");
    public static By filterCategoryRacketSports = By.xpath("//span[text()='Racket Sports' and @class='label']");
    public static By filterCategoryRacketSportsLabel = By.xpath("//span[text()='Racket Sports' and @class='filter-value']");
    public static By filterCategoryShoes = By.xpath("//span[text()='Shoes' and @class='label']");
    public static By filterCategoryShoesLabel = By.xpath("//span[text()='Shoes' and @class='filter-value']");
    public static By removeFilterCategoryRacketSports = By.cssSelector("a[title='Remove Category Racket Sports']");
    /*1.12 skipped */
    public static By filterCategoryClothing = By.xpath("//span[text()='Clothing' and @class='label']");
    public static By filterCategoryClothingLabel = By.xpath("//span[text()='Clothing' and @class='filter-value']");
    public static By filterCategoryAccessories = By.xpath("//span[text()='Accessories' and @class='label']");   
    public static By filterCategoryAccessoriesLabel = By.xpath("//span[text()='Accessories' and @class='filter-value']");
    public static By filterCategoryRuuning = By.xpath("//span[text()='Running' and @class='label']");
    public static By filterCategoryRunningLabel = By.xpath("//span[text()='Running' and @class='filter-value']");
    public static By clearAllButton = By.cssSelector("a[href='https://sportsjam.in/catalogsearch/result/index/?q=Adidas']");
    /*1.20 skipped */
}