package uistore;

import org.openqa.selenium.By;

public class SportsJamFooterLocators {

    private SportsJamFooterLocators(){}
    
    public static final By facebookIcon=By.xpath("//a[@class='athlete2-social-icon athlete2-icon-facebook']");
    public static final By youtubeIcon=By.xpath("//a[@class='athlete2-social-icon athlete2-icon-youtube']");
    public static final By instaIcon=By.cssSelector("a[class='athlete2-social-icon athlete2-icon-instagram']");
    public static final By twitterIcon=By.cssSelector("a[class='athlete2-social-icon athlete2-icon-twitter']");
}
