package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.ShopSportsLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ShopSportsPage {
    ExtentTest test;
    WebDriverHelper helper;
    public ShopSportsPage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver, test);
    }
    public void HoverOnRacketSports(){
        helper.hoverOverElement(ShopSportsLocators.racketSport, "Hovered On Racket Sports");
    }
    public void clickonShopSportswear(){
        helper.clickOnElement(ShopSportsLocators.sportswear, "Clicked on shopSportsWear");
    }
    public void verifyURLClothing(){
        String data= Base.driver.getCurrentUrl();
        try {
            Assert.assertTrue(data.contains("buy-clothing-online-india"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void VerifyClothing(){
        try {
            String data=helper.getText(ShopSportsLocators.clothing, "Verified Clothing");
            Assert.assertEquals(data, "CLOTHING");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickonListView(){
        helper.clickOnElement(ShopSportsLocators.ListByView,"Clicked on ListView");
    }
    public void clickonCompare1(){
        helper.clickOnElement(ShopSportsLocators.compare, "Clicked On Compare product 1");
    }
    // public void verifyYouaddedproducttothecomparisonlist(){
    //     // try {
    //     //     String data=helper.getText(ShopSportsLocators.youaddedproducttocomparison, "Verified");
    //     //     Assert.assertTrue(data.contains("You added product Yonex Mens Shorts (2692-Jet Black) to the "));
    //     // } catch (Exception e) {
    //     //     e.printStackTrace();
    //     // }
    // }
    public void clickonCompare2(){
        helper.clickOnElement(ShopSportsLocators.compare2, "Clicked On Compare Product 2");
    }
    public void verifyComapre2(){
        try {
            String data=helper.getText(ShopSportsLocators.youaddedproducttocomparison2, "Verified");
            Assert.assertTrue(data.contains(data));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickonCompareProductList(){
        helper.clickOnElement(ShopSportsLocators.compareList, "Clicked On compare Products");
    }
    public void verifyCompareProducts(){
        try {
            String data=helper.getText(ShopSportsLocators.compareProducts, "Verified");
            Assert.assertTrue(data.contains("COMPARE PRODUCTS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickonX1(){
        helper.clickOnElement(ShopSportsLocators.firstX, "Clicked On X1");
    }
    public void clickonOK1(){
        helper.clickOnElement(ShopSportsLocators.ok, "Clicked On ok1");
    }
    public void verifyOK1(){
        try {
            String data=helper.getText(ShopSportsLocators.nolongerlisted, "Verified");
            Assert.assertEquals(data,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickonx2(){
        helper.clickOnElement(ShopSportsLocators.secondX, "Clicked on ok2");
    }
    public void clickonOk2(){
        helper.clickOnElement(ShopSportsLocators.ok2, "Clicked On ok2");
    }
    public void verifyOK2(){
        try {
            String data=helper.getText(ShopSportsLocators.nolongerlisted2, "Verified");
            Assert.assertEquals(data,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyMessage(){
        try {
            String data=helper.getText(ShopSportsLocators.noproductslisted, "Verified");
            Assert.assertEquals(data,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Screenshot.captureScreenShot("NO items");
    }
    public void testcase3(){
        HoverOnRacketSports();
        clickonShopSportswear();
        verifyURLClothing();
        clickonListView();
        clickonCompare1();
        // verifyYouaddedproducttothecomparisonlist();
        clickonCompare2();
        verifyComapre2();
        clickonCompareProductList();
        verifyCompareProducts();
        clickonX1();
        clickonOK1();
        verifyOK1();
        clickonx2();
        clickonOk2();
        verifyOK2();
        verifyMessage();
    }


}
