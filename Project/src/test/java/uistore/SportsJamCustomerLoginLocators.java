package uistore;

import org.openqa.selenium.By;

public class SportsJamCustomerLoginLocators {
    
    public static By promtMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public static By email = By.xpath("//input[@name='login[username]']");
    public static By password = By.xpath("//input[@name='login[password]']");
    public static By signin = By.xpath("(//button[@name='send'])[1]");
    public static By signInText = By.xpath("(//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)'])[1]");

}
