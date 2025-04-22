package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.ProtectiveGearLocators;
import uistore.ShopSportsLocators;
import utils.Base;
import utils.WebDriverHelper;

public class ProtectiveGearPage {
    ExtentTest test;
    WebDriverHelper helper;
    public ProtectiveGearPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver, test);
    }
    public void HoverOnTeamSport(){
        helper.hoverOverElement(ProtectiveGearLocators.teamsport,"Hovered on Team Sport");
    }
    public void HoveredOnProtectiveGear(){
        helper.hoverOverElement(ProtectiveGearLocators.protectivegear,"Hovered On Protective Gear");
    }
    public void clickOnBattingGloves(){
        helper.clickOnElement(ProtectiveGearLocators.battingGloves, "Clicked On Batting Gloves");
    }
    public void verifyBattingGlovesURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/batting-gloves-cricket-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyBattingGloves(){
        try {
            String data=helper.getText(ProtectiveGearLocators.verifyWicketKeepingLegGuard, "Verified ");
            Assert.assertEquals(data, "BATTING GLOVES");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 
    public void clickOnBattingLegGuards(){
        helper.clickOnElement(ProtectiveGearLocators.BattingegGuards, "Clicked On Batting Leg Guards");
    }
    public void verifyBattingLeguardURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/batting-leg-guards-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyBattingLegGuard(){
        try {
            String data=helper.getText(ProtectiveGearLocators.verifyWicketKeepingLegGuard, "Verified ");
            Assert.assertEquals(data, "BATTING LEG GUARD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// 
    public void clickOnWicketKeepingGloves(){
        helper.clickOnElement(ProtectiveGearLocators.wicketKeepingGloves, "Clicked On Wicket Keeping Gloves");
    }
    public void verifyWicketKeepingGlovesURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/wicket-keeping-gloves-cricket-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyWicketKeepingGloves(){
        try {
            String data=helper.getText(ProtectiveGearLocators.verifyWicketKeepingLegGuard, "Verified ");
            Assert.assertEquals(data, "WICKET KEEPING GLOVES");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickoNWicketKeepingLegGuard(){
        helper.clickOnElement(ProtectiveGearLocators.wicketKeepingLegGuards, "Clicked On WicketKeepingLegGuard");
    }
    public void verifyWicketKeepingLegGuardURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/wicket-keeping-leg-guards-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyWicketKeepingLegGuard(){
        try {
            String data=helper.getText(ProtectiveGearLocators.verifyWicketKeepingLegGuard, "Verified ");
            Assert.assertEquals(data, "WICKET KEEPING LEG GUARD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickonCricketHelmets(){
        helper.clickOnElement(ProtectiveGearLocators.cricketHelmets, "Clicked On Cricket Helmets");
    }
    public void verifyCricketHelmetsURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/cricket-helmets-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyCricketHelmets(){
        try {
            String data=helper.getText(ProtectiveGearLocators.verifyCricketHelmets, "Verified ");
            Assert.assertEquals(data, "CRCIKET HELMETS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ClickOnInnerThighPads(){
        helper.clickOnElement(ProtectiveGearLocators.InnerThighPads, "Clicked On InnerThighPads");
    }
    public void verifyInnerThighPadsURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/cricket-inner-thigh-pads-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyInnerThighPads(){
        try {
            String data=helper.getText(ProtectiveGearLocators.VerifyInnerThighPads, "Verified ");
            Assert.assertEquals(data, "INNER THIGH PADS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
