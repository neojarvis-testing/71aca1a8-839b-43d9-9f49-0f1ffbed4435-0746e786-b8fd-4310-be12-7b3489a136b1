package pages;

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
    public void HoverOnTeamSport(){
        helper.hoverOverElement(ProtectiveGearLocators.teamsport,"Hovered on Team Sport");
    }
    public void HoveredOnProtectiveGear(){
        helper.hoverOverElement(ProtectiveGearLocators.protectivegear,"Hovered On Protective Gear");
    }
    public void clickOnBattingGloves(){
        helper.clickOnElement(ProtectiveGearLocators.battingGloves, "Clicked On Batting Gloves");
    }
    public void verifyBattingGloves(){

    }
    public void verifyBattingGlovesURL(){
        
    }
    // 
    public void clickOnBattingLegGuards(){
        helper.clickOnElement(ProtectiveGearLocators.BattingegGuards, "Clicked On Batting Leg Guards");
    }
    public void verifyBattingLeguardURL(){

    }
    public void verifyBattingLegGuard(){

    }
// 
    public void clickOnWicketKeepingGloves(){
        helper.clickOnElement(ProtectiveGearLocators.wicketKeepingGloves, "Clicked On Wicket Keeping Gloves");
    }


}
