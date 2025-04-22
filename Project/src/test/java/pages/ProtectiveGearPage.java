package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.ProtectiveGearLocators;
import utils.Base;
import utils.WebDriverHelper;

public class ProtectiveGearPage {
    ExtentTest test;
    WebDriverHelper helper;
    public ProtectiveGearPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver, test);
    }
    /*
     * a. Method Name: HoverOnTeamSport
     * b. Author Name: Muralidhar
     * c. Description: This will be used to hover on Team Sports.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void hoverOnTeamSport(){
        helper.hoverOverElement(ProtectiveGearLocators.teamsport,"Hovered on Team Sport");
    }
    /*
     * a. Method Name: HoveredOnProtectiveGear
     * b. Author Name: Muralidhar
     * c. Description: This will be used to hover on Team Sports.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void hoveredOnProtectiveGear(){
        helper.hoverOverElement(ProtectiveGearLocators.protectivegear,"Hovered On Protective Gear");
    }
    /*
     * a. Method Name: clickOnBattingGloves
     * b. Author Name: Muralidhar
     * c. Description: This will be used to click on Batting gloves.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnBattingGloves(){
        helper.clickOnElement(ProtectiveGearLocators.battingGloves, "Clicked On Batting Gloves");
    }
    /*
     * a. Method Name: verifyBattingGlovesURL
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify Batting gloves URL.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyBattingGlovesURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/batting-gloves-cricket-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    /*
     * a. Method Name: verifyBattingGloves
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify Batting gloves .
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyBattingGloves(){
        try {
            String data=helper.getText(ProtectiveGearLocators.BattingGlovesverify, "Verified ");
            Assert.assertEquals(data, "BATTING GLOVES");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     /*
     * a. Method Name: clickOnBattingLegGuards
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click On batting leg Guards
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnBattingLegGuards(){
        helper.clickOnElement(ProtectiveGearLocators.BattingegGuards, "Clicked On Batting Leg Guards");
    }
    /*
     * a. Method Name: verifyBattingLeguardURL
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify batting leg guard URL
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyBattingLeguardURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/batting-leg-guards-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: verifyBattingLeguard
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify batting leg guard.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyBattingLegGuard(){
        try {
            String data=helper.getText(ProtectiveGearLocators.BattingGlovesverify, "Verified ");
            Assert.assertEquals(data, "BATTING LEG GUARDS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: clickOnWicketKeepingGloves
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on wicket keeping gloves
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnWicketKeepingGloves(){
        helper.clickOnElement(ProtectiveGearLocators.wicketKeepingGloves, "Clicked On Wicket Keeping Gloves");
    }
    /*
     * a. Method Name: verifyWicketKeepingGlovesURL
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify wicket keeping URL
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyWicketKeepingGlovesURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/wicket-keeping-gloves-cricket-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: verifyWicketKeepingGloves
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify wicket keeping.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyWicketKeepingGloves(){
        try {
            String data=helper.getText(ProtectiveGearLocators.BattingGlovesverify, "Verified ");
            Assert.assertEquals(data, "WICKET KEEPING GLOVES");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     /*
     * a. Method Name: clickoNWicketKeepingLegGuard
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on wicket keeping leg Guard
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickoNWicketKeepingLegGuard(){
        helper.clickOnElement(ProtectiveGearLocators.wicketKeepingLegGuards, "Clicked On WicketKeepingLegGuard");
    }
    /*
     * a. Method Name: verifyWicketKeepingLegGuardURL
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify wicket keeping URL
     * d. Parameter: None
     * e. Return Type: void
     */
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
            String data=helper.getText(ProtectiveGearLocators.BattingGlovesverify, "Verified ");
            Assert.assertEquals(data, "WICKET KEEPING LEG GUARDS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     /*
     * a. Method Name: clickonCricketHelmets
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on Cricket Helmets
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickonCricketHelmets(){
        helper.clickOnElement(ProtectiveGearLocators.cricketHelmets, "Clicked On Cricket Helmets");
    }
    /*
     * a. Method Name: verifyWicketKeepingGlovesURL
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify wicket keeping URL
     * d. Parameter: None
     * e. Return Type: void
     */
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
            String data=helper.getText(ProtectiveGearLocators.BattingGlovesverify, "Verified ");
            Assert.assertEquals(data, "CRICKET HELMETS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     /*
     * a. Method Name: ClickOnInnerThighPads
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Click on Inner Thigh pads
     * d. Parameter: None
     * e. Return Type: void
     */
    public void clickOnInnerThighPads(){
        helper.clickOnElement(ProtectiveGearLocators.InnerThighPads, "Clicked On InnerThighPads");
    }
    /*
     * a. Method Name: verifyInnerThighPadsURL
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify Inner Thighs pads URL
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyInnerThighPadsURL(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("/cricket-inner-thigh-pads-shop-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * a. Method Name: verifyInnerThighPads
     * b. Author Name: Muralidhar
     * c. Description: This will be used to Verify Inner Thighs pads.
     * d. Parameter: None
     * e. Return Type: void
     */
    public void verifyInnerThighPads(){
        try {
            String data=helper.getText(ProtectiveGearLocators.BattingGlovesverify, "Verified ");
            Assert.assertEquals(data, "INNER THIGH PADS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testcase4(){
        try{
        hoverOnTeamSport();
        hoveredOnProtectiveGear();
        clickOnBattingGloves();
        verifyBattingGlovesURL();
        verifyBattingGloves();
        Base.driver.navigate().back();
        hoverOnTeamSport();
        hoveredOnProtectiveGear();
        clickOnBattingLegGuards();
        verifyBattingLeguardURL();
        verifyBattingLegGuard();
        Base.driver.navigate().back();
        hoverOnTeamSport();
        hoveredOnProtectiveGear();
        clickOnWicketKeepingGloves();
        verifyWicketKeepingGlovesURL();
        verifyWicketKeepingGloves();
        Base.driver.navigate().back();
        hoverOnTeamSport();
        hoveredOnProtectiveGear();
        clickoNWicketKeepingLegGuard();
        verifyWicketKeepingLegGuardURL();
        verifyWicketKeepingLegGuard();
        Base.driver.navigate().back();
        hoverOnTeamSport();
        hoveredOnProtectiveGear();
        clickonCricketHelmets();
        verifyCricketHelmetsURL();
        verifyCricketHelmets();
        Base.driver.navigate().back();
        hoverOnTeamSport();
        hoveredOnProtectiveGear();
        clickOnInnerThighPads();
        verifyInnerThighPadsURL();
        verifyInnerThighPads();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
