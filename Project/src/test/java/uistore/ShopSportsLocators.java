package uistore;

import org.openqa.selenium.By;

public class ShopSportsLocators {
	private ShopSportsLocators(){}

	public static final By racketSport=By.cssSelector("a[href='https://sportsjam.in/racket-sports']>span.name");
	public static final By sportswear=By.xpath("(//a[text()='SHOP SPORTSWEAR'])[2]");
	public static final By clothing=By.cssSelector("span.base");
	public static final By ListByView=By.cssSelector("a#mode-list");
	public static final By compare=By.xpath("//span[text()='Compare']");
	public static final By youaddedproducttocomparison=By.xpath("//div[contains(text(),'You added product Yonex Mens Shorts (2692-Jet Black) to the ')]");
	public static final By compare2=By.xpath("(//span[text()='Compare'])[2]");
	public static final By youaddedproducttocomparison2=By.xpath("//div[contains(text(),'You added product Yonex Mens Shorts (2693-Jet Black) to the')]");
	public static final By compareList=By.xpath("//a[text()='comparison list']");
	public static final By compareProducts=By.cssSelector("span.base");
	public static final By firstX=By.xpath("//a[@class='action delete']");
	public static final By ok=By.cssSelector("button.action-primary");
	public static final By nolongerlisted=By.xpath("//div[contains(text(),'You removed product Yonex Mens Sh')]");
	public static final By secondX=By.xpath("//a[@class='action delete']");
	public static final By ok2=By.cssSelector("button.action-primary");
	public static final By nolongerlisted2=By.xpath("//div[contains(text(),'You removed product Yonex Mens Shorts (2692-Jet Black)')]");
	public static final By noproductslisted=By.xpath("//div[text()='You have no items to compare.']");


}
