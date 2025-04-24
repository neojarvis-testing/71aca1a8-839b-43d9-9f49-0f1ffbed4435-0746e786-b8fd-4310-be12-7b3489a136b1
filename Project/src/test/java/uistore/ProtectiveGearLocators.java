package uistore;

import org.openqa.selenium.By;

public class ProtectiveGearLocators {
    private ProtectiveGearLocators(){}

    public static final By teamsport=By.xpath("//span[text()='Team Sport']");
    public static final By protectivegear=By.xpath("//span[text()='Protective Gear']");
    public static final By battingGloves=By.xpath("//span[text()='Batting Gloves']");
    public static final By BattingGlovesverify=By.xpath("//h1/child::span");
    public static final By BattingegGuards=By.cssSelector("a[href='https://sportsjam.in/sports/cricket-equipment-store-online-india/cricket-protective-gear-shop-online-india/batting-leg-guards-shop-online-india']>span.name");
    public static final By verigyBattinglegGuards=By.xpath("(//span[text()='Batting Leg Guards'])[2]");
    public static final By wicketKeepingGloves=By.xpath("//span[text()='Wicket Keeping Gloves']");
    public static final By VerifyWicketKeepingGlove=By.xpath("(//span[text()='Wicket Keeping Gloves'])[2]");
    public static final By wicketKeepingLegGuards=By.xpath("//span[text()='Wicket Keeping Leg Guards']");
    public static final By verifyWicketKeepingLegGuard=By.xpath("(//span[text()='Wicket Keeping Leg Guards'])[2]");
    public static final By cricketHelmets=By.xpath("//span[text()='Cricket Helmets']");
    public static final By verifyCricketHelmets=By.xpath("(//span[text()='Cricket Helmets'])[2]");
    public static final By InnerThighPads=By.xpath("//span[text()='Inner Thigh Pads']");
    public static final By VerifyInnerThighPads=By.xpath("(//span[text()='Inner Thigh Pads'])[2]");
}
