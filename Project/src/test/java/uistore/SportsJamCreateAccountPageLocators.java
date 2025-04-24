package uistore;

import org.openqa.selenium.By;

public class SportsJamCreateAccountPageLocators {

    private SportsJamCreateAccountPageLocators(){}
    
    public static final By loginIcon = By.xpath("//i[@class='athlete2-icon-login']");
    public static final By loginButton = By.xpath("//a[text()='Log In']");
    public static final By verifySignIn = By.xpath("//strong[@id='block-customer-login-heading']");
    public static final By createAccount = By.xpath("//span[text()='Create an Account']");
    public static final By firstName = By.cssSelector("input[id='firstname']");
    public static final By lastName = By.cssSelector("input[id='lastname']");
    public static final By email = By.cssSelector("input[id='email_address']");
    public static final By password = By.cssSelector("input[id='password']");
    public static final By confirmPassword = By.cssSelector("input[id='password-confirmation']");
    public static final By create = By.cssSelector("button[id='send2']");
    public static final By thankYou = By.xpath("//div[text()='Thank you for registering with SportsJam.']");
    public static final By logout = By.xpath("//a[text()='Logout']");
    public static final By youAreSignedOut = By.xpath("//h1/child::span[contains(text(),'You are sign')]");
    public static final By loginEmail = By.cssSelector("input[id='email']");
    public static final By loginPassword = By.cssSelector("input[id='pass']");
    public static final By signIn = By.xpath("//span[text()='Sign In']");
    public static final By errorMessage = By.xpath("//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']");
}
