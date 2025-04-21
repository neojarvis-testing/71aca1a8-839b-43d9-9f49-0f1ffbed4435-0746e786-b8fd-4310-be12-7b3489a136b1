package uistore;

import org.openqa.selenium.By;

public class ShopSportsLocators {
     public static By racketSport=By.cssSelector("a[href='https://sportsjam.in/racket-sports']>span.name");
	 public static By sportswear=By.xpath("(//a[text()='SHOP SPORTSWEAR'])[2]");
	 public static By clothing=By.cssSelector("span.base");
	 public static By ListByView=By.cssSelector("a#mode-list");
	 public static By compare=By.xpath("//span[text()='Compare']");
	 public static By youaddedproducttocomparison=By.xpath("//div[text()='You added product Yonex Mens Shorts (2692-Jet Black) to the ']");
	 public static By compare2=By.xpath("(//span[text()='Compare'])[2]");
	 public static By youaddedproducttocomparison2=By.xpath("//div[text()='You added product Yonex Mens Shorts (2693-Jet Black) to the ']");
	 public static By compareList=By.xpath("//div[text()='You added product Yonex Mens Shorts (2693-Jet Black) to the ']");
	 public static By compareProducts=By.cssSelector("span.base");
	 public static By firstX=By.xpath("//span[text()='Remove Product']");
	 public static By ok=By.cssSelector("button.action-primary");
     public static By nolongerlisted=By.xpath("//div[text()='You removed product Yonex Mens Shorts (2693-Jet Black) from the comparison list.']");
     public static By secondX=By.xpath("(//span[text()='Remove Product'])[2]");
     public static By ok2=By.xpath("//span[text()='OK']");
     public static By nolongerlisted2=By.xpath("//div[text()='You removed product Yonex Mens Shorts (2692-Jet Black) from the comparison list.']");
     public static By noproductslisted=By.xpath("//div[text()='You have no items to compare.']");


}
