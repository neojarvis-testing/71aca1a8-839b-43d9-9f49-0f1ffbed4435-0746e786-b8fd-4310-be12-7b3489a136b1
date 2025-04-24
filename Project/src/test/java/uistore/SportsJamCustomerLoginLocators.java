package uistore;

import org.openqa.selenium.By;

public class SportsJamCustomerLoginLocators {
    
    private SportsJamCustomerLoginLocators(){}

    public static final By promtMessage = By.xpath("//div[contains(text(),'You must login or register')]");
    public static final By email = By.xpath("//input[@name='login[username]']");
    public static final By password = By.xpath("//input[@name='login[password]']");
    public static final By signIn = By.xpath("(//button[@name='send'])[1]");
    public static final By signInText = By.xpath("//div[contains(text(),'The account sign-in')]");

}
