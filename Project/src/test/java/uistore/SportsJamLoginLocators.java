package uistore;

import org.openqa.selenium.By;

public class SportsJamLoginLocators {

    private SportsJamLoginLocators(){}

    public static final By login=By.xpath("//a[text()=' Register / Login']");
    public static final By delivery=By.cssSelector("a[href='/delivery-information']");
    public static final By payment=By.cssSelector("a[href='/payment-options']");
    public static final By FAQs=By.cssSelector("a[href='/sportsjam-frequently-asked-questions']");
    public static final By policy=By.cssSelector("a[href='/returns-policy']");
}
