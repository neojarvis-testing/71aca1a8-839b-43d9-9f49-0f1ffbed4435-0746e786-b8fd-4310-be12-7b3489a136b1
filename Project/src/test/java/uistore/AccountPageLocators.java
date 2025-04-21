package uistore;

import org.openqa.selenium.By;

public class AccountPageLocators {
    public static By loginIcon = By.xpath("//i[@class='athlete2-icon-login']");
    public static By loginButton = By.xpath("//a[text()='Log In']");
    public static By verifySignIn = By.xpath("//strong[@id='block-customer-login-heading']");
    public static By createAccount = By.xpath("//span[text()='Create an Account']");
    public static By firstname = By.cssSelector("input[id='firstname']");
    public static By lastname = By.cssSelector("input[id='lastname']");
    public static By email = By.cssSelector("input[id='email_address']");
    public static By password = By.cssSelector("input[id='password']");
    public static By confirmPassword = By.cssSelector("input[id='password-confirmation']");
    public static By create = By.cssSelector("button[id='send2']");
    public static By thankYou = By.xpath("//div[text()='Thank you for registering with SportsJam.']");
    public static By logout = By.xpath("//a[text()='Logout']");
    
}
