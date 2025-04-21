package uistore;

import org.openqa.selenium.By;

public class SportsJamCustomerLoginLocators {
    
    public static By promtMessage = By.xpath("//div[contains(text(),'You must login or register')]");
    public static By email = By.xpath("//input[@name='login[username]']");
    public static By password = By.xpath("//input[@name='login[password]']");
    public static By signin = By.xpath("(//button[@name='send'])[1]");
    public static By signInText = By.xpath("//div[contains(text(),'The account sign-in')]");

}
